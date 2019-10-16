package commercetools.oauth;

import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.oauth2.AnonymousSessionTokenSupplier;
import io.vrap.rmf.impl.okhttp.VrapOkhttpClient;
import org.junit.Assert;
import org.junit.Test;

import static commercetools.utils.CommercetoolsTestUtils.*;

public class AnonymousSessionAuthIntegrationTest {

    private static final VrapHttpClient vrapHttpClient = new VrapOkhttpClient();
    
    @Test
    public void execute() {
        AnonymousSessionTokenSupplier anonymousSessionTokenSupplier = new AnonymousSessionTokenSupplier(
                getClientId(),
                getClientSecret(),
                "",
                "https://auth.sphere.io/oauth/" + getProjectKey() + "/anonymous/token",
                vrapHttpClient
        );
        
        try{
            String accessToken = anonymousSessionTokenSupplier.getToken().get().getAccessToken();
            Assert.assertNotNull(accessToken);
            Assert.assertFalse(accessToken.isEmpty());
        }catch (Exception e){
            Assert.fail("Failed to obtain anonymous session token");
        }
    }
    
}
