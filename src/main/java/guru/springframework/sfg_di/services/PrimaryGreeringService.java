package guru.springframework.sfg_di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreeringService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Primary Greeting Service says Hello World ";
    }
}
