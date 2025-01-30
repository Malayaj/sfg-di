package guru.springframework.sfg_di.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Setter Injected Greeting Service is saying Hello World!!!";
    }
}
