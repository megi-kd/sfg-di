package guru.springframework.sfgdi.services.solid;

import org.springframework.stereotype.Service;

@Service
public class HealthInsuranceSurveyor implements  InsuranceSurveyor{


    @Override
    public boolean isValidClaim() {
        System.out.println("HealthInsuranceSurveyor : validate health insurance claim...");
        return true;
    }
}
