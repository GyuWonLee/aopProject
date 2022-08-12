
package com.gyuone.main;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.gyuone.concert.IUConcert;
import com.gyuone.concert.Performance;
import com.gyuone.concert.PianoConcert;
import com.gyuone.config.ConcertConfig;

public class ConcertMain {
    public static void main(String[] args) throws Exception{
        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(ConcertConfig.class);
        
        System.out.println("-------------------<PiaonoConcert>-------------------");
        Performance performance = ctx.getBean("pianoConcert", PianoConcert.class);
        performance.perform();
        
        System.out.println("-------------------<IU Concert>-------------------");
        performance = ctx.getBean("iuConcert", IUConcert.class);
        performance.perform();
        
        ctx.close();
    }
}
