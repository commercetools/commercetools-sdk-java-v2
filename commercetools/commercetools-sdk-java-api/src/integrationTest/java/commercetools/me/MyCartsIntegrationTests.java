
package commercetools.me;

import static commercetools.utils.CommercetoolsTestUtils.getProjectKey;

import java.util.concurrent.ExecutionException;

import com.commercetools.api.client.ApiRoot;
import com.commercetools.api.defaultconfig.ApiFactory;
import com.commercetools.api.models.me.MyCart;
import com.commercetools.api.models.me.MyCartDraft;
import com.commercetools.api.models.me.MyCartDraftBuilder;
import commercetools.utils.CommercetoolsTestUtils;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.oauth2.AnonymousSessionTokenSupplier;
import io.vrap.rmf.base.client.oauth2.StaticTokenSupplier;

import org.junit.Assert;
import org.junit.Test;

public class MyCartsIntegrationTests {
    private static final VrapHttpClient vrapHttpClient = HttpClientSupplier.of().get();

    @Test
    public void signInWithAnonymousCartWithNewActiveCart() throws ExecutionException, InterruptedException {
        AnonymousSessionTokenSupplier anonymousSessionTokenSupplier = new AnonymousSessionTokenSupplier(
            CommercetoolsTestUtils.getClientId(), CommercetoolsTestUtils.getClientSecret(), null,
            "https://auth.europe-west1.gcp.commercetools.com/oauth/" + getProjectKey() + "/anonymous/token",
            vrapHttpClient);

        final StaticTokenSupplier staticTokenSupplier = new StaticTokenSupplier(
            anonymousSessionTokenSupplier.getToken().get());

        final ApiHttpClient apiAnonymousHttpClient = ClientBuilder.of(vrapHttpClient)
                .withApiBaseUrl("https://api.europe-west1.gcp.commercetools.com/")
                .withTokenSupplier(staticTokenSupplier)
                .build();
        ApiRoot apiAnonymousRoot = ApiFactory.create(() -> apiAnonymousHttpClient);

        MyCartDraft anonymousMyCartDraft = MyCartDraftBuilder.of().currency("EUR").country("DE").build();

        MyCart myCart = apiAnonymousRoot.withProjectKey(getProjectKey())
                .me()
                .carts()
                .post(anonymousMyCartDraft)
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(myCart);

        MyCart myCartGet = apiAnonymousRoot.withProjectKey(getProjectKey())
                .me()
                .activeCart()
                .get()
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(myCartGet);

        apiAnonymousRoot.withProjectKey(getProjectKey())
                .me()
                .carts()
                .withId(myCart.getId())
                .delete()
                .withVersion(myCart.getVersion())
                .executeBlocking();
    }
}
