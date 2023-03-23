
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Image;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveImageChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveImageChange removeImageChange = RemoveImageChange.builder()
 *             .change("{change}")
 *             .catalogData("{catalogData}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RemoveImageChangeImpl.class)
public interface RemoveImageChange extends Change {

    String REMOVE_IMAGE_CHANGE = "RemoveImageChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update actions for removing images</p>
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
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<Image> getPreviousValue();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<Image> getNextValue();

    public void setChange(final String change);

    public void setCatalogData(final String catalogData);

    @JsonIgnore
    public void setPreviousValue(final Image... previousValue);

    public void setPreviousValue(final List<Image> previousValue);

    @JsonIgnore
    public void setNextValue(final Image... nextValue);

    public void setNextValue(final List<Image> nextValue);

    public static RemoveImageChange of() {
        return new RemoveImageChangeImpl();
    }

    public static RemoveImageChange of(final RemoveImageChange template) {
        RemoveImageChangeImpl instance = new RemoveImageChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static RemoveImageChangeBuilder builder() {
        return RemoveImageChangeBuilder.of();
    }

    public static RemoveImageChangeBuilder builder(final RemoveImageChange template) {
        return RemoveImageChangeBuilder.of(template);
    }

    default <T> T withRemoveImageChange(Function<RemoveImageChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<RemoveImageChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveImageChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveImageChange>";
            }
        };
    }
}
