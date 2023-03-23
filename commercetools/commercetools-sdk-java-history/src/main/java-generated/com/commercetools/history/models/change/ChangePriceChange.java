
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Price;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangePriceChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangePriceChange changePriceChange = ChangePriceChange.builder()
 *             .change("{change}")
 *             .catalogData("{catalogData}")
 *             .priceId("{priceId}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangePriceChangeImpl.class)
public interface ChangePriceChange extends Change {

    String CHANGE_PRICE_CHANGE = "ChangePriceChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for changing prices</p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return catalogData
     */
    @NotNull
    @JsonProperty("catalogData")
    public String getCatalogData();

    /**
     *
     * @return priceId
     */
    @NotNull
    @JsonProperty("priceId")
    public String getPriceId();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Price getPreviousValue();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Price getNextValue();

    public void setChange(final String change);

    public void setCatalogData(final String catalogData);

    public void setPriceId(final String priceId);

    public void setPreviousValue(final Price previousValue);

    public void setNextValue(final Price nextValue);

    public static ChangePriceChange of() {
        return new ChangePriceChangeImpl();
    }

    public static ChangePriceChange of(final ChangePriceChange template) {
        ChangePriceChangeImpl instance = new ChangePriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPriceId(template.getPriceId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static ChangePriceChangeBuilder builder() {
        return ChangePriceChangeBuilder.of();
    }

    public static ChangePriceChangeBuilder builder(final ChangePriceChange template) {
        return ChangePriceChangeBuilder.of(template);
    }

    default <T> T withChangePriceChange(Function<ChangePriceChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangePriceChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangePriceChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangePriceChange>";
            }
        };
    }
}
