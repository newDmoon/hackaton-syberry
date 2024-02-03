package syberry.api.telegrambot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankService {
    @Value("${bank.names}")
    List<String> bankNames;

    public List<String> getBankNames() {
        return bankNames;
    }
}
