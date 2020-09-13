package com.example.demo.controller;

import com.example.demo.entity.TestUser;
import com.example.demo.entity.UserBody;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Car;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@EnableConfigurationProperties({UserBody.class})
public class HelloController {
    @Autowired
    UserBody userBody;
    @Autowired
    TestUser testuser;

    @RequestMapping(value="/hello",method= RequestMethod.GET)
    public String sayHello(){
        return  "hello spring boot";
    }
    @RequestMapping("/car")
    public Car findOneCar(){
        Car car = new Car(1L,"许帅",1.1f,new Date());
        return  car;
    }


   @InitBinder
   private  void initBinder(WebDataBinder wecDataBinder){
        wecDataBinder.addCustomFormatter(new DateFormatter("yyyy-MM-dd HH:mm:ss"));

   }


    @GetMapping("/getUser")
    public String getUser(){
        return userBody.toString();
    }
    @GetMapping("/gettestuser")
    public String gettestUser() {
        return testuser.toString();
    }

    //获取全部车两信息
    @GetMapping("/getCar1")
    public List<Car> getCarList(){
        List<Car> carList = new ArrayList();
        return  carList;

    }
    //新增全部车两信息
    @PostMapping("/addCar1")
    public String addCarList(Car car){
        List<Car> carList = new ArrayList<>();
        carList.add(car);
        return  "success";

    }
    //获取指定车两信息
    @GetMapping("/{id}")
    public Car findCar(@PathVariable("id") Long id,List<Car> carList){
        for (Car car : carList) {
            if (car.getId()==id){
                return car;
            }

        }
        return null;

    }
    //更新指定车两信息
    @PutMapping("/update/{id}")
    public String updateCarList(@PathVariable("id") Long id,Car car){
        List<Car> carList = new ArrayList<>();
        for (Car car1 : carList) {
            if (car1.getId()==id){
                car1.setId(id);
                car1.setName("xushuai");

            }

        }
        return "success";

    }
    //删除指定车两信息
    @GetMapping("/delete/{id}")
    @ApiOperation(value = "删除指定用户信息" ,notes = "根据id删除用户信息")
    @ApiImplicitParam(name="id" ,value="用户id",required = true,dataType ="Long" )
    public String deleteCar(@PathVariable("id") String id,List<Car> carList){
      carList.remove(id);
        return "success";

    }
}
