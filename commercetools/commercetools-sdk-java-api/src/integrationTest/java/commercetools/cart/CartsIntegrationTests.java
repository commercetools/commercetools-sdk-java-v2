package commercetools.cart;

import com.commercetools.api.client.ApiRoot;
import com.commercetools.api.client.ByProjectKeyRequestBuilder;
import com.commercetools.api.defaultconfig.ApiFactory;
import com.commercetools.api.models.api_client.ApiClient;
import com.commercetools.api.models.cart.*;
import com.commercetools.api.models.customer.*;
import com.commercetools.api.models.me.MyCart;
import com.commercetools.api.models.me.MyCartDraft;
import com.commercetools.api.models.me.MyCartDraftBuilder;
import com.commercetools.api.models.product.Product;
import com.commercetools.api.models.product.ProductVariantBuilder;
import com.fasterxml.jackson.databind.JsonNode;
import commercetools.api_client.ApiClientFixtures;
import commercetools.customer.CustomerFixtures;
import commercetools.me.MyCartsFixtures;
import commercetools.product.ProductFixtures;
import commercetools.utils.CommercetoolsTestUtils;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.ClientFactory;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.oauth2.AnonymousSessionTokenSupplier;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import io.vrap.rmf.okhttp.VrapOkHttpClient;
import org.junit.Assert;
import org.junit.Test;
import org.omg.PortableInterceptor.ACTIVE;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import static commercetools.utils.CommercetoolsTestUtils.*;

public class CartsIntegrationTests {
    private static final VrapHttpClient vrapHttpClient = new VrapOkHttpClient();

    @Test
    public void signInWithAnonymousCartWithNewActiveCart() throws ExecutionException, InterruptedException {

//       data preparation normal access
        Customer customer = CustomerFixtures.createCustomer();
        CustomerFixtures.deleteCustomer(customer.getId(), customer.getVersion());
        Product product = ProductFixtures.createProduct();
        ProductFixtures.deleteProductById(product.getId(), product.getVersion());

//     anonymous access
        AnonymousSessionTokenSupplier anonymousSessionTokenSupplier = new AnonymousSessionTokenSupplier(
                getClientId(),
                getClientSecret(),
                "create_anonymous_token:" + CommercetoolsTestUtils.getProjectKey(),
                "https://auth.europe-west1.gcp.commercetools.com/oauth/" + getProjectKey() + "/anonymous/token",
                vrapHttpClient
        );

        final ApiHttpClient apiAnonymousHttpClient = ClientFactory.create(
                "https://api.europe-west1.gcp.commercetools.com/",
                vrapHttpClient,
                anonymousSessionTokenSupplier
                );
        ApiRoot apiAnonymousRoot = ApiFactory.create(() -> apiAnonymousHttpClient);


//    cart creation


        MyCartDraft anonymousMyCartDraft = MyCartDraftBuilder.of()
                .currency("EUR")
                .country("DE")
                .build();


        MyCart myCart =  apiAnonymousRoot.withProjectKey(getProjectKey())
                .me().carts()
                .post(anonymousMyCartDraft)
                .executeBlocking()
                .getBody();

        MyCart anonymousMyCart = MyCartsFixtures.createMeCart(anonymousMyCartDraft);
        MyCartsFixtures.deleteMyCart(anonymousMyCart.getId(), anonymousMyCart.getVersion());


        Assert.assertNotNull(anonymousMyCart);

        //get active me cart from token
        //get token


        String accessToken = anonymousSessionTokenSupplier.getToken().get().getAccessToken();

        //filter cart get active cart by token


        MyCart myCartGet = apiAnonymousRoot.withProjectKey((getProjectKey()))
                .me().activeCart()
                .get()
                .executeBlocking()
                .getBody();



    }
}
