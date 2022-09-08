
package com.commercetools.ml.models.missing_data;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MissingPricesProductLevel
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MissingPricesProductLevel missingPricesProductLevel = MissingPricesProductLevel.builder()
 *             .total(0.3)
 *             .missingPrices(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MissingPricesProductLevelImpl.class)
@Deprecated
public interface MissingPricesProductLevel extends MissingPricesProductCount {

    /**
     *  <p>Number of products scanned.</p>
     */
    @NotNull
    @JsonProperty("total")
    public Long getTotal();

    /**
     *  <p>Number of products missing prices.</p>
     */
    @NotNull
    @JsonProperty("missingPrices")
    public Long getMissingPrices();

    public void setTotal(final Long total);

    public void setMissingPrices(final Long missingPrices);

    public static MissingPricesProductLevel of() {
        return new MissingPricesProductLevelImpl();
    }

    public static MissingPricesProductLevel of(final MissingPricesProductLevel template) {
        MissingPricesProductLevelImpl instance = new MissingPricesProductLevelImpl();
        instance.setTotal(template.getTotal());
        instance.setMissingPrices(template.getMissingPrices());
        return instance;
    }

    public static MissingPricesProductLevelBuilder builder() {
        return MissingPricesProductLevelBuilder.of();
    }

    public static MissingPricesProductLevelBuilder builder(final MissingPricesProductLevel template) {
        return MissingPricesProductLevelBuilder.of(template);
    }

    default <T> T withMissingPricesProductLevel(Function<MissingPricesProductLevel, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MissingPricesProductLevel> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MissingPricesProductLevel>() {
            @Override
            public String toString() {
                return "TypeReference<MissingPricesProductLevel>";
            }
        };
    }
}
