
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.ProductSelectionSetting;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetProductSelectionsChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetProductSelectionsChange setProductSelectionsChange = SetProductSelectionsChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetProductSelectionsChangeImpl.class)
public interface SetProductSelectionsChange extends Change {

    String SET_PRODUCT_SELECTIONS_CHANGE = "SetProductSelectionsChange";

    /**
     *
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>setProductSelections</code></p>
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<ProductSelectionSetting> getPreviousValue();

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<ProductSelectionSetting> getNextValue();

    public void setChange(final String change);

    @JsonIgnore
    public void setPreviousValue(final ProductSelectionSetting... previousValue);

    public void setPreviousValue(final List<ProductSelectionSetting> previousValue);

    @JsonIgnore
    public void setNextValue(final ProductSelectionSetting... nextValue);

    public void setNextValue(final List<ProductSelectionSetting> nextValue);

    public static SetProductSelectionsChange of() {
        return new SetProductSelectionsChangeImpl();
    }

    public static SetProductSelectionsChange of(final SetProductSelectionsChange template) {
        SetProductSelectionsChangeImpl instance = new SetProductSelectionsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetProductSelectionsChangeBuilder builder() {
        return SetProductSelectionsChangeBuilder.of();
    }

    public static SetProductSelectionsChangeBuilder builder(final SetProductSelectionsChange template) {
        return SetProductSelectionsChangeBuilder.of(template);
    }

    default <T> T withSetProductSelectionsChange(Function<SetProductSelectionsChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetProductSelectionsChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetProductSelectionsChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetProductSelectionsChange>";
            }
        };
    }
}
