package guru.springframework.sfg_di.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Constructor Injected Greeting Service is saying Hello World!!!";
    }
}
