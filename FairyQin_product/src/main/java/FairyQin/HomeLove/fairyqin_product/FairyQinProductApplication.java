package FairyQin.HomeLove.fairyqin_product;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("FairyQin/HomeLove/fairyqin_product/dao")
public class FairyQinProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(FairyQinProductApplication.class, args);
    }

}
