package guru.springframework.sfgdi.services.solid;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class VehicleInsuranceSurveyor implements  InsuranceSurveyor{

    @Override
    public boolean isValidClaim() {
        System.out.println("VehicleInsuranceSurveyor : validate vehicle insurance claim...");
        return true;
    }
}
