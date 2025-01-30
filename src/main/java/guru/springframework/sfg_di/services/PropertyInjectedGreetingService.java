package guru.springframework.sfg_di.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Property Injected Greeting Service is saying Hello World!!!";
    }
}
