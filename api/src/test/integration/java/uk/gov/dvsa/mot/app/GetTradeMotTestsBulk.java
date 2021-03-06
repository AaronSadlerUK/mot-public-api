package uk.gov.dvsa.mot.app;

import org.junit.BeforeClass;
import org.junit.Test;

import uk.gov.dvsa.mot.security.ParamObfuscator;
import uk.gov.dvsa.mot.trade.api.TradeException;
import uk.gov.dvsa.mot.trade.api.TradeServiceRequest;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.container.ContainerRequestContext;

/**
 * A simple test harness for locally invoking your Lambda function handler.
 */
public class GetTradeMotTestsBulk {

    private static TradeServiceRequest input = new TradeServiceRequest();

    @BeforeClass
    public static void createInput() throws IOException {

        input.setPage(0);
    }

    private ContainerRequestContext createContext() {

        ContainerRequestContext ctx = new RequestContext();

        ctx.setMethod("TradeHandler");

        return ctx;
    }

    @Test
    public void testTradeHandler() {

        try {
            TradeServiceRequestHandler tradeServiceRequestHandler = new TradeServiceRequestHandler();
            ContainerRequestContext ctx = createContext();

            System.setProperty(ConfigKeys.ObfuscationSecret, "BbV[`8d7zQnc:?}\"CSz$L0t+(3r:_uT$");
            String obfuscatedVehicleId = ParamObfuscator.obfuscate(input.getVehicleId().toString());
            List<?> output = (List<?>) tradeServiceRequestHandler.getTradeMotTests(obfuscatedVehicleId, input.getNumber(),
                    input.getRegistration(), input.getDate(), input.getPage(), ctx).getEntity();

            if (output != null) {
                System.out.println(output.toString());
            }
        } catch (TradeException | ParamObfuscator.ObfuscationException e) {
            e.printStackTrace();
        }
    }
}
