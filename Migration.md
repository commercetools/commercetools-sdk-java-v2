# Guide to migrate from the JVM SDK v1 to the Java SDK v2

This guide helps developers to migrate from the JVM SDK v1 to the Java SDK v2.

## Table of content

* [Client Configuration and Creation](#client-configuration-and-creation)
* [Timeout Setting](#timout-setting)
* [Headers](#headers)
* [Retry](#retry)
* [Draft Builder](#draft-builder)
* [Create Command](#create-command)
* [Create From Json](#create-from-json)
* [Update Command](#update-command)
* [Query - GetById](#query-getbyid)
* [Query](#query)

<a id="client-configuration-and-creation"></a>
### Client Configuration and Creation
From the 1.x we substitute the <strong>SphereClientFactory</strong> class with the <strong>ApiRootBuilder</strong> class in the 2.x.

The benefit is that after the <strong>ApiRootBuilder</strong> has been defined, it's easy to create the requests directly from it. There are example below that can clarify the behaviour.

1.x
```java
        final SphereClient sphereClient = SphereClientFactory.of()
            .createClient("projectKey", "clientId", "clientSecret");
```
2.x
```java
        final ByProjectKeyRequestBuilder projectRoot = ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of().withClientId("clientId").withClientSecret("clientSecret").build(),
                            ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(), ServiceRegion.GCP_EUROPE_WEST1.getApiUrl())
                .buildForProject("projectKey");
```

<a id="timout-setting"></a>
### Timeout Setting
In both versions is the <strong>executeBlocking()</strong> method that sets the timeout.

1.x
```java
        PagedQueryResult<Category> response = blockingClient().executeBlocking(CategoryQuery.of(), 45,
                                                 TimeUnit.SECONDS);
```
2.x
```java
        CategoryPagedQueryResponse response = projectClient().categories()
                                                .get()
                                                .executeBlocking(Duration.ofSeconds(45))
                                                .getBody();
```

<a id="headers"></a>
### Headers
To set headers, in the 1.x there is the <strong>HttpRequest</strong> class and in the 2.x the <strong>ApiHttpRequest</strong> class.

The main difference, as you can see the example below, is that the <strong>ApiHttpRequest</strong> can be directly instantiated and it can be directly set the type of method (GET or POST), the URI, the headers and the body.

1.x
        There is no way to set the header directly in the request
2.x
```java
        final CartPagedQueryResponse carts = projectClient().carts()
                .get()
                .addHeader("foo", "bar")
                .executeBlocking()
                .getBody();
```
<a id="retry"></a>
### Retry
In the examples below there is a huge difference about the *Retry* for the version 1.x and 2.x.

* As can be seen, in the version 1.x, it has to be define piece by piece: the retry rules, then the <strong>SphereClient</strong> and then the request in this case <strong>PagedQueryResult</strong>.

* On the contrary in the version 2.x, the setup of the request can be built directly during the client creation,
so we are going to have the <strong>ByProjectKeyRequestBuilder</strong> built including the setting of the Retry through the <strong>RetryMiddleware</strong> and as a plus, like in this case,
it is possible to set up other parameters to our request like the logger <strong>InternalLoggerFactory</strong>.
After that, we will have our request <strong>CategoryPagedQueryResponse</strong>.


1.x
```java
        final int maxAttempts = 5;
        final List<RetryRule> retryRules = singletonList(RetryRule.of(
                    RetryPredicate.ofMatchingStatusCodes(BAD_GATEWAY_502, SERVICE_UNAVAILABLE_503, GATEWAY_TIMEOUT_504),
                    RetryAction.ofExponentialBackoff(maxAttempts, 100, 2000)));
        final SphereClient client = RetrySphereClientDecorator.of(sphereClient(), retryRules);

        final PagedQueryResult<Category> categoryPagedQueryResult = client.execute(CategoryQuery.of())
                .toCompletableFuture()
                .get();
```
2.x
```java
        final ByProjectKeyRequestBuilder projectClient = ApiRootBuilder.of()
                .defaultClient(ServiceRegion.GCP_EUROPE_WEST1.getApiUrl(),
                                ClientCredentials.of().withClientId("clientId").withClientSecret("clientSecret").build(),
                                ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl())
                .withRetryMiddleware(5, Arrays.asList(BAD_GATEWAY_502, SERVICE_UNAVAILABLE_503, GATEWAY_TIMEOUT_504))
                .buildForProject("projectKey");

        final CategoryPagedQueryResponse body = projectClient.categories().get().executeBlocking().getBody();
```
<a id="draft-builder"></a>
### Draft Builder
About the *DraftBuilder* the main difference is that in the 2.x there are not inheritances for the *DraftBuilder* classes, but there are no so much differences in the behaviour.

1.x
```java
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
```
2.x
```java
        String en = Locale.ENGLISH.toLanguageTag();
        LocalizedString name = LocalizedStringBuilder.of().addValue(en, "name").build();
        LocalizedString slug = LocalizedStringBuilder.of().addValue(en, "slug").build();
        LocalizedString metaDescription = LocalizedStringBuilder.of().addValue(en, "metaDescription").build();
        LocalizedString metaTitle = LocalizedStringBuilder.of().addValue(en, "metaTitle").build();
        LocalizedString metaKeywords = LocalizedStringBuilder.of().addValue(en, "metaKeywords").build();
        CategoryDraft categoryDraft = CategoryDraftBuilder.of()
                .name(name)
                .slug(slug)
                .externalId("externalId")
                .metaTitle(metaTitle)
                .metaDescription(metaDescription)
                .metaKeywords(metaKeywords)
                .build();
```
<a id="create-command"></a>
### Create Command
In the 2.x there are not dedicated classes for the *Create Command*, but there are builders (you can see better in the [Update Command](#update-command)). It means that to have a request it needs to have a draft to build which has to be passed into the *post()* method.

Here the differences:

1.x
```java
        LocalizedString name = LocalizedString.ofEnglish("name");
        LocalizedString slug = LocalizedString.ofEnglish("slug");
        CategoryDraft categoryDraft = CategoryDraftBuilder.of(name, slug).build();
        Category category = blockingClient().executeBlocking(CategoryCreateCommand.of(categoryDraft));
```
2.x
```java
        String en = Locale.ENGLISH.toLanguageTag();
        LocalizedString name = LocalizedStringBuilder.of().addValue(en, "name").build();
        LocalizedString slug = LocalizedStringBuilder.of().addValue(en, "slug").build();
        CategoryDraft categoryDraft = CategoryDraftBuilder.of().name(name).slug(slug).build();
        Category category = projectClient().categories().post(categoryDraft).executeBlocking().getBody();
```
<a id="create-from-json"></a>
### Create From Json
The main difference in this case is that we replaced the <strong>SphereJsonUtils</strong> class with the <strong>JsonUtils</strong> class.


1.x
```java
        final CategoryDraft categoryDraft = SphereJsonUtils.readObjectFromResource("category.json",
                    CategoryDraft.class);
        final Category category = blockingClient().executeBlocking(CategoryCreateCommand.of(categoryDraft));
```
2.x
```java
        final CategoryDraft categoryDraft = JsonUtils.fromJsonString(TestUtils.stringFromResource("category.json"),
                    CategoryDraft.class);
        final Category category = projectClient().categories().post(categoryDraft).executeBlocking().getBody();
```
<a id="update-command"></a>
### Update Command
Like the [Create Command](#create-command), there are not dedicated classes for the *Update Command*, but the use of the <strong>UpdateBuilder</strong> to create the type of update action to apply in the <strong>post</strong> method is substantial to build the update action.

Here the differences:

1.x
```java
        LocalizedString newName = LocalizedString.ofEnglish("new name");
        CategoryUpdateCommand command = CategoryUpdateCommand.of(category,
            Collections.singletonList(ChangeName.of(newName)));
        Category updatedCategory = blockingClient().executeBlocking(command);
```
2.x
```java
        LocalizedString newName = LocalizedStringBuilder.of().addValue("en", "new name").build();
        CategoryUpdate categoryUpdate = CategoryUpdateBuilder.of()
                .version(category.getVersion())
                .actions(CategoryChangeNameActionBuilder.of().name(newName).build())
                .build();

        Category updatedCategory = projectClient().categories()
                .withId(category.getId())
                .post(categoryUpdate)
                .executeBlocking()
                .getBody();
```

<a id="query-getbyid"></a>
### Query - GetById
In case of query by Id, the 2.x is not so different from the previous cases, except that it uses the <strong>get</strong> method before other ways to filter our request.

1.x
```java
        Category loadedCategory = blockingClient()
                .executeBlocking(CategoryByIdGet.of(category.getId()).withExpansionPaths(m -> m.parent()));
```
2.x
```java
        Category queriedCategory = projectClient().categories()
                .withId(category.getId())
                .get()
                .withExpand("parent")
                .executeBlocking()
                .getBody();
```
<a id="query"></a>
### Query
To continue the previous case, to build complex query we use <strong>ResourcePagedQueryResponse(in the 1.x is PagedQueryResult)</strong> which is meant to apply limit, count, total, offset, and result to our query.
And the structure as the example before is to use <strong>get</strong> before other ways to filter our request.

1.x
```java
        PagedQueryResult<Category> pagedQueryResult = blockingClient()
                .executeBlocking(CategoryQuery.of().byId("id123"));
```
2.x
```java
        CategoryPagedQueryResponse response = projectClient().categories()
                .get()
                .withWhere("id = :id")
                .withPredicateVar("id", "id123")
                .executeBlocking()
                .getBody();
```

