
package com.commercetools.ml.client;

public interface ProjectScopedApiRoot {
    ByProjectKeyRequestBuilder with();

    ByProjectKeyImageSearchRequestBuilder imageSearch();

    ByProjectKeyRecommendationsRequestBuilder recommendations();

    ByProjectKeySimilaritiesRequestBuilder similarities();
}
