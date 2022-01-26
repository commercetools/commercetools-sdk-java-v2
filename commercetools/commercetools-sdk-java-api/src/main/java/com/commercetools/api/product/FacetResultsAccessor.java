
package com.commercetools.api.product;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.product.FacetResult;
import com.commercetools.api.models.product.FacetResults;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.json.JsonUtils;

/**
 * @deprecated use {@link com.commercetools.api.models.product.FacetResultsAccessor} instead
 */
@Deprecated
public class FacetResultsAccessor extends com.commercetools.api.models.product.FacetResultsAccessor {
    public FacetResultsAccessor(FacetResults value) {
        super(value);
    }
}
