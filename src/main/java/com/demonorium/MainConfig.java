package com.demonorium;

import com.demonorium.utils.SessionController;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "utils")
@Import({DatabaseConfig.class, WebConfig.class})
public class MainConfig {
    SessionController sessionController() {
        return new SessionController();
    }
}
