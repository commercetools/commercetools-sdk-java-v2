package commercetools;

import com.commercetools.api.client.ByProjectKeyRequestBuilder;
import com.commercetools.api.defaultconfig.ApiFactory;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.api.models.category.Category;
import commercetools.utils.CommercetoolsTestUtils;
import io.vrap.rmf.base.client.ApiHttpException;
import io.vrap.rmf.base.client.http.RetryMiddleware;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.ThrowableAssertAlternative;
import org.assertj.core.util.Lists;
import org.junit.Assert;
import org.junit.Test;

import static java.util.Collections.singletonList;


public class MiddlewareTest {

    @Test
    public void execute() {
        String projectKey = CommercetoolsTestUtils.getProjectKey();

        ByProjectKeyRequestBuilder b = ApiFactory.createForProject(
                projectKey,
                ClientCredentials.of().withClientId(CommercetoolsTestUtils.getClientId())
                        .withClientSecret(CommercetoolsTestUtils.getClientSecret())
                        .build(),
                ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(),
                ServiceRegion.GCP_EUROPE_WEST1.getApiUrl(),
                Lists.newArrayList(new RetryMiddleware(3, singletonList(404)))
        );


        Assertions.assertThatExceptionOfType(RuntimeException.class).isThrownBy(
                () -> {
                    Category category = b
                            .categories()
                            .withId("1234")
                            .get()
                            .executeBlocking().getBody();
                }
        );
    }
}
