package uk.gov.dvsa.mot.trade.api.response;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RfrAndAdvisoryV2Response extends RfrAndAdvisoryResponse {

    private boolean dangerous;

    public boolean isDangerous() {

        return dangerous;
    }

    public RfrAndAdvisoryV2Response setDangerous(boolean dangerous) {

        this.dangerous = dangerous;
        return this;
    }
}
