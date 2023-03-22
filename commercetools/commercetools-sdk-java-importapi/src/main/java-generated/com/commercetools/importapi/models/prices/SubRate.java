
package com.commercetools.importapi.models.prices;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SubRate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SubRate subRate = SubRate.builder()
 *             .name("{name}")
 *             .amount(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SubRateImpl.class)
public interface SubRate {

    /**
     *
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *
     * @return amount
     */
    @NotNull
    @JsonProperty("amount")
    public Double getAmount();

    public void setName(final String name);

    public void setAmount(final Double amount);

    public static SubRate of() {
        return new SubRateImpl();
    }

    public static SubRate of(final SubRate template) {
        SubRateImpl instance = new SubRateImpl();
        instance.setName(template.getName());
        instance.setAmount(template.getAmount());
        return instance;
    }

    public static SubRateBuilder builder() {
        return SubRateBuilder.of();
    }

    public static SubRateBuilder builder(final SubRate template) {
        return SubRateBuilder.of(template);
    }

    default <T> T withSubRate(Function<SubRate, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SubRate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SubRate>() {
            @Override
            public String toString() {
                return "TypeReference<SubRate>";
            }
        };
    }
}
