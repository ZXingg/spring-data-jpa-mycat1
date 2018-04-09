package jpa.mycat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by zxing on 17-1-5.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class SalesmanServiceTest {
    @Autowired
    private SalesmanService service;

    @Test
    public void testFindAll() {
        service.findAll().forEach(salesman -> System.out.println(salesman.toString()));
    }

    @Test
    public void testSave() {

        for (int i = 11; i < 20; i++) {
            service.save(new Salesman("zx" + i));
        }

    }
}
