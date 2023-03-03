
package com.commercetools.docs.meta;

/**
 * {@include.toc}
 * <h2 id="compatibility-module">SDK v1 compatibility module</h2>
 *
 * <p>The SDK provides a compatibility module. This module e.g. allows the usage of the SDKv2 client
 * with in conjunction with all the commands of the SDKv1. For more details please see {@link Compatibility}</p>
 *
 * <h2 id="client-configuration-and-creation">Client Configuration and Creation</h2>
 *
 * <p>From the 1.x we substitute the <strong>SphereClientFactory</strong> class with the <strong>ApiRootBuilder</strong> class in the 2.x.</p>
 *
 * <p>The benefit is that after the <strong>ApiRootBuilder</strong> has been defined, it's easy to create the requests directly from it.
 * There are example below that can clarify the behaviour.</p>
 *
 * <p>
 *     <b>v1</b>
 *     {@include.example example.MigrationV1#configuration()}
 *     <b>v2</b>
 *     {@include.example example.MigrationV2#configuration()}
 * </p>
 *
 * <h2 id="timout-setting">Timeout Setting</h2>
 *
 * <p>In both versions is the <strong>executeBlocking()</strong> method that sets the timeout.</p>
 *
 * <p>
 *     <b>v1</b>
 *     {@include.example example.MigrationV1#timeoutSettings()}
 *     <b>v2</b>
 *     {@include.example example.MigrationV2#timeoutSettings()}
 * </p>
 *
 * <h2 id="headers">Headers</h2>
 *
 * <p>To set headers, in the 1.x there is the <strong>HttpRequest</strong> class and in the 2.x the <strong>ApiHttpRequest</strong> class.</p>
 *
 * <p>The main difference, as you can see the example below, is that the <strong>ApiHttpRequest</strong> can be directly instantiated and it
 * can be directly set the type of method (GET or POST), the URI, the headers and the body.</p>
 *
 * <p>
 *     <b>v1</b>
 *     <pre>There is no way to set the header directly in the request</pre>
 *     <b>v2</b>
 *     {@include.example example.MigrationV2#headers()}
 * </p>
 *
 * <h2 id="retry">Retry</h2>
 *
 * <p>In the examples below there is a huge difference about the *Retry* for the v1 and v2.</p>
 *
 * <p>As can be seen, in the v1, it has to be define piece by piece: the retry rules, then the
 * <strong>SphereClient</strong> and then the request in this case <strong>PagedQueryResult</strong>.</p>
 *
 * <p>On the contrary in the v2, the setup of the request can be built directly during the client creation,
 * so we are going to have the <strong>ByProjectKeyRequestBuilder</strong> built including the setting of the Retry
 * through the <strong>RetryMiddleware</strong> and as a plus, like in this case, it is possible to set up other
 * parameters to our request like the logger <strong>InternalLoggerFactory</strong>. After that, we will have our
 * request <strong>CategoryPagedQueryResponse</strong>.</p>
 *
 * <p>
 *     <b>v1</b>
 *     {@include.example example.MigrationV1#retry()}
 *     <b>v2</b>
 *     {@include.example example.MigrationV2#retry()}
 * </p>
 *
 * <h2 id="draft-builder">Draft Builder</h2>
 *
 * <p>About the *DraftBuilder* the main difference is that in the 2.x there are not inheritances for the *DraftBuilder* classes,
 * but there are no so much differences in the behaviour.</p>
 *
 * <p>
 *     <b>v1</b>
 *     {@include.example example.MigrationV1#draftBuilder()}
 *     <b>v2</b>
 *     {@include.example example.MigrationV2#draftBuilder()}
 * </p>
 *
 * <h2 id="create-command">Create Command</h2>
 *
 * <p>In the v2 there are not dedicated classes for the <strong>Create Command</strong>, but there are builders (you can see better in the
 * <a href="#update-command">Update Command</a>. It means that to have a request it needs to have a draft to build which has to be passed
 * into the <strong>post()</strong> method.</p>
 *
 * <p>
 *     <b>v1</b>
 *     {@include.example example.MigrationV1#createCommand()}
 *     <b>v2</b>
 *     {@include.example example.MigrationV2#createCommand()}
 * </p>
 *
 * <h2 id="create-from-json">Create From Json</h2>
 *
 * <p>The main difference in this case is that we replaced the {@link io.sphere.sdk.json.SphereJsonUtils} class with the {@link io.vrap.rmf.base.client.utils.json.JsonUtils} class.</p>
 *
 * <p>
 *     <b>v1</b>
 *     {@include.example example.MigrationV1#fromJson()}
 *     <b>v2</b>
 *     {@include.example example.MigrationV2#fromJson()}
 * </p>
 *
 * <h2 id="update-command">Update Command</h2>
 *
 * <p>Like the <a href="#create-command">Create Command</a>, there are not dedicated classes for the *Update Command*, but the use of
 * the <strong>UpdateBuilder</strong> to create the type of update action to apply in the <strong>post</strong> method is substantial
 * to build the update action.</p>
 *
 * <p>Here the differences:</p>
 *
 * <p>
 *     <b>v1</b>
 *     {@include.example example.MigrationV1#updateCommand()}
 *     <b>v2</b>
 *     {@include.example example.MigrationV2#updateCommand()}
 * </p>
 *
 * <h2 id="query-getbyid">Query - GetById</h2>
 *
 * <p>In case of query by Id, the v2 is not so different from the previous cases, except that it uses the <strong>get</strong>
 * method before other ways to filter our request.</p>
 *
 * <p>
 *     <b>v1</b>
 *     {@include.example example.MigrationV1#queryById()}
 *     <b>v2</b>
 *     {@include.example example.MigrationV2#queryById()}
 * </p>
 *
 * <h2 id="query">Query</h2>
 *
 * <p>To continue the previous case, to build complex query we use <strong>{@link com.commercetools.api.models.ResourcePagedQueryResponse}
 * (in the v1 is {@link io.sphere.sdk.queries.PagedQueryResult})</strong> which is meant to apply limit, count, total, offset, and result
 * to our query. And the structure as the example before is to use <strong>get</strong> before other ways to filter our request.</p>
 *
 * <p>
 *     <b>v1</b>
 *     {@include.example example.MigrationV1#query()}
 *     <b>v2</b>
 *     {@include.example example.MigrationV2#query()}
 * </p>
 */
public class Migration {
}
