
package commercetools.me;

import static commercetools.utils.CommercetoolsTestUtils.getProjectKey;

import java.util.concurrent.ExecutionException;

import com.commercetools.api.client.ApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.me.MyCartDraft;
import com.commercetools.api.models.me.MyCartDraftBuilder;
import commercetools.utils.CommercetoolsTestUtils;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyCartsIntegrationTests {
    private static final VrapHttpClient vrapHttpClient = HttpClientSupplier.of().get();

    @Test
    public void signInWithAnonymousCartWithNewActiveCart() throws ExecutionException, InterruptedException {
        ApiRoot apiAnonymousRoot = ApiRootBuilder.of(vrapHttpClient)
                .defaultClient("https://api.europe-west1.gcp.commercetools.com/")
                .withAnonymousSessionFlow(
                    ClientCredentials.of()
                            .withClientId(CommercetoolsTestUtils.getClientId())
                            .withClientSecret(CommercetoolsTestUtils.getClientSecret())
                            .build(),
                    "https://auth.europe-west1.gcp.commercetools.com/oauth/" + getProjectKey() + "/anonymous/token")
                .build();

        MyCartDraft anonymousMyCartDraft = MyCartDraftBuilder.of().currency("EUR").country("DE").build();

        Cart myCart = apiAnonymousRoot.withProjectKey(getProjectKey())
                .me()
                .carts()
                .post(anonymousMyCartDraft)
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(myCart);

        Cart myCartGet = apiAnonymousRoot.withProjectKey(getProjectKey())
                .me()
                .activeCart()
                .get()
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(myCartGet);

        apiAnonymousRoot.withProjectKey(getProjectKey())
                .me()
                .carts()
                .withId(myCart.getId())
                .delete()
                .withVersion(myCart.getVersion())
                .executeBlocking();
    }
}
