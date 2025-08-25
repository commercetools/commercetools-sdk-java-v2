
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.Image;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSetImageLabelAction" rel="nofollow">Set Image Label</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetImageLabelChange setImageLabelChange = SetImageLabelChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .catalogData("{catalogData}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetImageLabelChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetImageLabelChangeImpl.class)
public interface SetImageLabelChange extends Change {

    /**
     * discriminator value for SetImageLabelChange
     */
    String SET_IMAGE_LABEL_CHANGE = "SetImageLabelChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Image getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Image getNextValue();

    /**
     *  <ul>
     *   <li><code>staged</code>, if the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *   <li><code>current</code>, if the current <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *  </ul>
     * @return catalogData
     */
    @NotNull
    @JsonProperty("catalogData")
    public String getCatalogData();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Image previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Image nextValue);

    /**
     *  <ul>
     *   <li><code>staged</code>, if the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *   <li><code>current</code>, if the current <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *  </ul>
     * @param catalogData value to be set
     */

    public void setCatalogData(final String catalogData);

    /**
     * factory method
     * @return instance of SetImageLabelChange
     */
    public static SetImageLabelChange of() {
        return new SetImageLabelChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetImageLabelChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetImageLabelChange of(final SetImageLabelChange template) {
        SetImageLabelChangeImpl instance = new SetImageLabelChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setCatalogData(template.getCatalogData());
        return instance;
    }

    public SetImageLabelChange copyDeep();

    /**
     * factory method to create a deep copy of SetImageLabelChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetImageLabelChange deepCopy(@Nullable final SetImageLabelChange template) {
        if (template == null) {
            return null;
        }
        SetImageLabelChangeImpl instance = new SetImageLabelChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(com.commercetools.history.models.common.Image.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.Image.deepCopy(template.getNextValue()));
        instance.setCatalogData(template.getCatalogData());
        return instance;
    }

    /**
     * builder factory method for SetImageLabelChange
     * @return builder
     */
    public static SetImageLabelChangeBuilder builder() {
        return SetImageLabelChangeBuilder.of();
    }

    /**
     * create builder for SetImageLabelChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetImageLabelChangeBuilder builder(final SetImageLabelChange template) {
        return SetImageLabelChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetImageLabelChange(Function<SetImageLabelChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetImageLabelChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetImageLabelChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetImageLabelChange>";
            }
        };
    }
}
