package commercetools.oauth;

import com.commercetools.client.ApiRoot;
import com.commercetools.models.customer.Customer;
import com.commercetools.models.customer.CustomerDraft;
import com.commercetools.models.customer.CustomerDraftBuilder;
import commercetools.customer.CustomerFixtures;
import commercetools.utils.CommercetoolsTestUtils;
import io.vrap.rmf.base.client.AuthenticationToken;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.middlewares.HttpMiddleware;
import io.vrap.rmf.base.client.middlewares.LoggerMiddleware;
import io.vrap.rmf.base.client.oauth2.ClientCredentialsTokenSupplier;
import io.vrap.rmf.base.client.oauth2.GlobalCustomerPasswordTokenSupplier;
import io.vrap.rmf.impl.okhttp.VrapOkhttpClient;
import org.junit.Assert;
import org.junit.Test;

import static commercetools.utils.CommercetoolsTestUtils.*;

public class GlobalCustomerPasswordAuthIntegrationTest {

    private static final VrapHttpClient vrapHttpClient = new VrapOkhttpClient();
    
    @Test
    public void execute() {
        String password = "pw-" + CommercetoolsTestUtils.randomString();
        
        CustomerDraft customerDraft = CustomerDraftBuilder.of()
                .email("test-email-" + CommercetoolsTestUtils.randomString() + "@test.com")
                .key(CommercetoolsTestUtils.randomKey())
                .password(password)
                .build();

        Customer customer = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .customers()
                .post(customerDraft)
                .executeBlocking()
                .getBody()
                .getCustomer();
        
        String email = customer.getEmail();
        
        GlobalCustomerPasswordTokenSupplier globalCustomerPasswordTokenSupplier = new GlobalCustomerPasswordTokenSupplier(
                getClientId(),
                getClientSecret(),
                email,
                password,
                "",
                "https://auth.sphere.io/oauth/" + getProjectKey() + "/customers/token",
                vrapHttpClient
        );
        
        try{
            String token = globalCustomerPasswordTokenSupplier.getToken().get().getAccessToken();
            Assert.assertNotNull(token);
            Assert.assertFalse(token.isEmpty());
        }catch (Exception e) {
            Assert.fail("Obtaining token failed");
        }finally {
            CustomerFixtures.deleteCustomer(customer.getId(), customer.getVersion());
        }
    }
}
