
package example;

import static io.sphere.sdk.http.HttpStatusCode.*;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import io.sphere.sdk.categories.Category;
import io.sphere.sdk.categories.CategoryDraft;
import io.sphere.sdk.categories.CategoryDraftBuilder;
import io.sphere.sdk.categories.commands.CategoryCreateCommand;
import io.sphere.sdk.categories.commands.CategoryUpdateCommand;
import io.sphere.sdk.categories.commands.updateactions.ChangeName;
import io.sphere.sdk.categories.queries.CategoryByIdGet;
import io.sphere.sdk.categories.queries.CategoryQuery;
import io.sphere.sdk.client.BlockingSphereClient;
import io.sphere.sdk.client.RetrySphereClientDecorator;
import io.sphere.sdk.client.SphereClient;
import io.sphere.sdk.client.SphereClientFactory;
import io.sphere.sdk.json.SphereJsonUtils;
import io.sphere.sdk.models.LocalizedString;
import io.sphere.sdk.queries.PagedQueryResult;
import io.sphere.sdk.retry.RetryAction;
import io.sphere.sdk.retry.RetryPredicate;
import io.sphere.sdk.retry.RetryRule;

public class MigrationV1 {

    BlockingSphereClient blockingClient;
    SphereClient sphereClient;

    Category category;

    public void configuration() {
        final SphereClient sphereClient = SphereClientFactory.of()
                .createClient("projectKey", "clientId", "clientSecret");
    }

    public void timeoutSettings() {
        PagedQueryResult<Category> response = blockingClient.executeBlocking(CategoryQuery.of(), 45, TimeUnit.SECONDS);
    }

    public void retry() throws ExecutionException, InterruptedException {
        final int maxAttempts = 5;
        final List<RetryRule> retryRules = Collections.singletonList(RetryRule.of(
            RetryPredicate.ofMatchingStatusCodes(BAD_GATEWAY_502, SERVICE_UNAVAILABLE_503, GATEWAY_TIMEOUT_504),
            RetryAction.ofExponentialBackoff(maxAttempts, 100, 2000)));
        final SphereClient client = RetrySphereClientDecorator.of(sphereClient, retryRules);

        final PagedQueryResult<Category> categoryPagedQueryResult = client.execute(CategoryQuery.of())
                .toCompletableFuture()
                .get();
    }

    public void draftBuilder() {
        LocalizedString name = LocalizedString.ofEnglish("name");
        LocalizedString slug = LocalizedString.ofEnglish("slug");
        LocalizedString metaDescription = LocalizedString.ofEnglish("metaDescription");
        LocalizedString metaTitle = LocalizedString.ofEnglish("metaTitle");
        LocalizedString metaKeywords = LocalizedString.ofEnglish("metaKeywords");
        CategoryDraft categoryDraft = CategoryDraftBuilder.of(name, slug)
                .metaDescription(metaDescription)
                .metaTitle(metaTitle)
                .metaKeywords(metaKeywords)
                .externalId("externalId")
                .build();
    }

    public void createCommand() {
        LocalizedString name = LocalizedString.ofEnglish("name");
        LocalizedString slug = LocalizedString.ofEnglish("slug");
        CategoryDraft categoryDraft = CategoryDraftBuilder.of(name, slug).build();
        Category category = blockingClient.executeBlocking(CategoryCreateCommand.of(categoryDraft));
    }

    public void fromJson() {
        final CategoryDraft categoryDraft = SphereJsonUtils.readObjectFromResource("category.json",
            CategoryDraft.class);
        final Category category = blockingClient.executeBlocking(CategoryCreateCommand.of(categoryDraft));
    }

    public void updateCommand() {
        LocalizedString newName = LocalizedString.ofEnglish("new name");
        CategoryUpdateCommand command = CategoryUpdateCommand.of(category,
            Collections.singletonList(ChangeName.of(newName)));
        Category updatedCategory = blockingClient.executeBlocking(command);
    }

    public void queryById() {
        Category loadedCategory = blockingClient
                .executeBlocking(CategoryByIdGet.of(category.getId()).withExpansionPaths(m -> m.parent()));
    }

    public void query() {
        PagedQueryResult<Category> pagedQueryResult = blockingClient.executeBlocking(CategoryQuery.of().byId("id123"));
    }
}
