
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.SearchKeywords;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetSearchKeywordsChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetSearchKeywordsChange setSearchKeywordsChange = SetSearchKeywordsChange.builder()
 *             .change("{change}")
 *             .catalogData("{catalogData}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetSearchKeywordsChangeImpl.class)
public interface SetSearchKeywordsChange extends Change {

    /**
     * discriminator value for SetSearchKeywordsChange
     */
    String SET_SEARCH_KEYWORDS_CHANGE = "SetSearchKeywordsChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>setSearchKeywords</code></p>
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
    public SearchKeywords getPreviousValue();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public SearchKeywords getNextValue();

    /**
     *  <p>Update action for <code>setSearchKeywords</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set catalogData
     * @param catalogData value to be set
     */

    public void setCatalogData(final String catalogData);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final SearchKeywords previousValue);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final SearchKeywords nextValue);

    /**
     * factory method
     * @return instance of SetSearchKeywordsChange
     */
    public static SetSearchKeywordsChange of() {
        return new SetSearchKeywordsChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetSearchKeywordsChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetSearchKeywordsChange of(final SetSearchKeywordsChange template) {
        SetSearchKeywordsChangeImpl instance = new SetSearchKeywordsChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetSearchKeywordsChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetSearchKeywordsChange deepCopy(@Nullable final SetSearchKeywordsChange template) {
        if (template == null) {
            return null;
        }
        SetSearchKeywordsChangeImpl instance = new SetSearchKeywordsChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(com.commercetools.history.models.common.SearchKeywords::deepCopy)
                .orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(com.commercetools.history.models.common.SearchKeywords::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for SetSearchKeywordsChange
     * @return builder
     */
    public static SetSearchKeywordsChangeBuilder builder() {
        return SetSearchKeywordsChangeBuilder.of();
    }

    /**
     * create builder for SetSearchKeywordsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetSearchKeywordsChangeBuilder builder(final SetSearchKeywordsChange template) {
        return SetSearchKeywordsChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetSearchKeywordsChange(Function<SetSearchKeywordsChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetSearchKeywordsChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetSearchKeywordsChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetSearchKeywordsChange>";
            }
        };
    }
}
