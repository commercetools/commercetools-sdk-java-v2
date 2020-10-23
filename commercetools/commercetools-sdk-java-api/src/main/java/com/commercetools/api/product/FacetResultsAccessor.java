package com.commercetools.api.product;

import com.commercetools.api.models.product.FacetResult;
import com.commercetools.api.models.product.FacetResults;
import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;

import java.util.Map;
import java.util.stream.Collectors;

public class FacetResultsAccessor extends Accessor<FacetResults> {
    public FacetResultsAccessor(FacetResults value) {
        super(value);
    }

    public Map<String, FacetResult> facets()
    {
        return value.values().entrySet().stream().collect(Collectors.toMap(
                Map.Entry::getKey,
                entry -> VrapJsonUtils.getConfiguredObjectMapper().convertValue(entry.getValue(), FacetResult.class)
        ));
    }
}
