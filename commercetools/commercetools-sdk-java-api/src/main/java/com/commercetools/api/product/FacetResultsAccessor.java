
package com.commercetools.api.product;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.product.FacetResult;
import com.commercetools.api.models.product.FacetResults;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.json.JsonUtils;

public class FacetResultsAccessor extends Accessor<FacetResults> {
    public FacetResultsAccessor(FacetResults value) {
        super(value);
    }

    @Nullable
    public Map<String, FacetResult> facets() {
        return asFacetResultMap(value);
    }

    @Nullable
    public static Map<String, FacetResult> asFacetResultMap(FacetResults value) {
        return Optional.ofNullable(value.values())
                .map(values -> values.entrySet()
                        .stream()
                        .collect(Collectors.toMap(Map.Entry::getKey,
                            entry -> JsonUtils.getConfiguredObjectMapper()
                                    .convertValue(entry.getValue(), FacetResult.class))))
                .orElse(null);
    }
}
