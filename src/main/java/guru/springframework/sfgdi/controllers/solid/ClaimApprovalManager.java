package guru.springframework.sfgdi.controllers.solid;

import guru.springframework.sfgdi.services.solid_o.InsuranceSurveyor;
import org.springframework.stereotype.Controller;

@Controller
public class ClaimApprovalManager {

    private final InsuranceSurveyor insuranceSurveyor;

    public ClaimApprovalManager(InsuranceSurveyor insuranceSurveyor) {
        this.insuranceSurveyor = insuranceSurveyor;
    }

    public void processClaim() {
        if(insuranceSurveyor.isValidClaim()) {
            System.out.println("Claim Approval Manager : Valid Claim " + insuranceSurveyor.toString());
        }
    }
}
