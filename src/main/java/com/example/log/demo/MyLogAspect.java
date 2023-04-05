package com.example.log.demo;

import com.stellariver.milky.aspectj.tool.combine.AbstractCombineAspect;
import com.stellariver.milky.aspectj.tool.combine.LogConfig;
import com.stellariver.milky.aspectj.tool.combine.ValidateConfig;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyLogAspect extends AbstractCombineAspect {

    @Pointcut("within(com.example.log..*) && execution(* *(..))")
    public void logPC() {}
    public LogConfig logConfig() {
        return LogConfig.defaultConfig();
    }

    @Pointcut("within(com.example.log..*) && execution(* *(..))")
    public void validatePC() {}
    public ValidateConfig validateConfig() {
        return ValidateConfig.defaultConfig();
    }

    @Pointcut
    public void tlcPC() {}

    @Pointcut
    public void rateLimitPC() {}

}