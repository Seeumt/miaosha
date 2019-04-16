package com.miaoshaproject.validator;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;


import javax.validation.Validation;
import javax.validation.Validator;

@Component
public class ValidatorImpl implements InitializingBean {


    private Validator validator;

    //实现校验方法并返回校验结果
    public ValidationResult validate(Object bean){
        ValidationResult result = new

    }

    @Override
    public void afterPropertiesSet() throws Exception {

        this.validator= Validation.buildDefaultValidatorFactory().getValidator();
    }
}
