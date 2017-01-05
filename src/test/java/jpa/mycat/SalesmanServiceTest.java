package jpa.mycat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by ssab on 17-1-5.
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
  public void testSave(){
    Salesman salesman = new Salesman();

    salesman.setUserNum("3333333");
    salesman.setTrueName("ssab");

    salesman.setAddress("山东省莱芜市");
    salesman.setMobile("152222222");
    salesman.setDisabled(0);

    service.save(salesman);
  }
}
