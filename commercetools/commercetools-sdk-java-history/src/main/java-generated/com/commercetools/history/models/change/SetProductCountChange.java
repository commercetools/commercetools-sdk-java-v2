
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetProductCountChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetProductCountChange setProductCountChange = SetProductCountChange.builder()
 *             .change("{change}")
 *             .previousValue(1)
 *             .nextValue(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetProductCountChangeImpl.class)
public interface SetProductCountChange extends Change {

    String SET_PRODUCT_COUNT_CHANGE = "SetProductCountChange";

    /**
     *
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>setProductCount</code></p>
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     */
    @NotNull
    @JsonProperty("previousValue")
    public Integer getPreviousValue();

    /**
     *
     */
    @NotNull
    @JsonProperty("nextValue")
    public Integer getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final Integer previousValue);

    public void setNextValue(final Integer nextValue);

    public static SetProductCountChange of() {
        return new SetProductCountChangeImpl();
    }

    public static SetProductCountChange of(final SetProductCountChange template) {
        SetProductCountChangeImpl instance = new SetProductCountChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetProductCountChangeBuilder builder() {
        return SetProductCountChangeBuilder.of();
    }

    public static SetProductCountChangeBuilder builder(final SetProductCountChange template) {
        return SetProductCountChangeBuilder.of(template);
    }

    default <T> T withSetProductCountChange(Function<SetProductCountChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetProductCountChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetProductCountChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetProductCountChange>";
            }
        };
    }
}
