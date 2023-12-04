
package example;

import static io.vrap.rmf.base.client.http.HttpStatusCode.*;

import java.time.Duration;
import java.util.Arrays;

import com.commercetools.TestUtils;
import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.api.models.cart.CartPagedQueryResponse;
import com.commercetools.api.models.category.*;
import com.commercetools.api.models.common.LocalizedString;

import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import io.vrap.rmf.base.client.utils.json.JsonUtils;

public class MigrationV2 {
    ProjectApiRoot projectApiRoot;
    Category category;
    public void configuration() {
        final ProjectApiRoot projectRoot = ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of().withClientId("clientId").withClientSecret("clientSecret").build(),
                    ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(), ServiceRegion.GCP_EUROPE_WEST1.getApiUrl())
                .build("projectKey");
    }

    public void timeoutSettings() {
        CategoryPagedQueryResponse response = projectApiRoot.categories()
                .get()
                .executeBlocking(Duration.ofSeconds(45))
                .getBody();
    }

    public void headers() {
        final CartPagedQueryResponse carts = projectApiRoot.carts()
                .get()
                .addHeader("foo", "bar")
                .executeBlocking()
                .getBody();
    }

    public void retry() {
        final ProjectApiRoot projectClient = ApiRootBuilder.of()
                .defaultClient(ServiceRegion.GCP_EUROPE_WEST1.getApiUrl(),
                    ClientCredentials.of().withClientId("clientId").withClientSecret("clientSecret").build(),
                    ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl())
                .withPolicies(policies -> policies.withRetry(builder -> builder
                        .statusCodes(Arrays.asList(BAD_GATEWAY_502, SERVICE_UNAVAILABLE_503, GATEWAY_TIMEOUT_504))))
                .build("projectKey");

        final CategoryPagedQueryResponse body = projectClient.categories().get().executeBlocking().getBody();
    }

    public void draftBuilder() {
        LocalizedString name = LocalizedString.ofEnglish("name");
        LocalizedString slug = LocalizedString.ofEnglish("slug");
        LocalizedString metaDescription = LocalizedString.ofEnglish("metaDescription");
        LocalizedString metaTitle = LocalizedString.ofEnglish("metaTitle");
        LocalizedString metaKeywords = LocalizedString.ofEnglish("metaKeywords");

        CategoryDraft categoryDraft = CategoryDraftBuilder.of()
                .name(name)
                .slug(slug)
                .externalId("externalId")
                .metaTitle(metaTitle)
                .metaDescription(metaDescription)
                .metaKeywords(metaKeywords)
                .build();
    }

    public void createCommand() {
        LocalizedString name = LocalizedString.ofEnglish("name");
        LocalizedString slug = LocalizedString.ofEnglish("slug");
        CategoryDraft categoryDraft = CategoryDraftBuilder.of().name(name).slug(slug).build();
        Category category = projectApiRoot.categories().post(categoryDraft).executeBlocking().getBody();
    }

    public void fromJson() {
        final CategoryDraft categoryDraft = JsonUtils.fromJsonString(TestUtils.stringFromResource("category.json"),
            CategoryDraft.class);
        final Category category = projectApiRoot.categories().post(categoryDraft).executeBlocking().getBody();
    }

    public void updateCommand() {
        LocalizedString newName = LocalizedString.ofEnglish("new name");
        CategoryUpdate categoryUpdate = CategoryUpdateBuilder.of()
                .version(category.getVersion())
                .actions(CategoryChangeNameActionBuilder.of().name(newName).build())
                .build();

        Category updatedCategory = projectApiRoot.categories()
                .withId(category.getId())
                .post(categoryUpdate)
                .executeBlocking()
                .getBody();
    }

    public void queryById() {
        Category queriedCategory = projectApiRoot.categories()
                .withId(category.getId())
                .get()
                .withExpand("parent")
                .executeBlocking()
                .getBody();
    }

    public void query() {
        CategoryPagedQueryResponse response = projectApiRoot.categories()
                .get()
                .withWhere("id = :id", "id", "id123")
                .executeBlocking()
                .getBody();
    }

}
