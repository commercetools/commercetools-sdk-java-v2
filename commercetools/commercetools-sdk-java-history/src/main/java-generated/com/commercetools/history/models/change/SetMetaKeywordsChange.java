package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.change.SetMetaKeywordsChangeImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * SetMetaKeywordsChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetMetaKeywordsChange setMetaKeywordsChange = SetMetaKeywordsChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = SetMetaKeywordsChangeImpl.class)
public interface SetMetaKeywordsChange extends Change {

    /**
     * discriminator value for SetMetaKeywordsChange
     */
    String SET_META_KEYWORDS_CHANGE = "SetMetaKeywordsChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Shape of the action for <code>setMetaKeywords</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();
    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public LocalizedString getPreviousValue();
    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public LocalizedString getNextValue();

    /**
     *  <p>Shape of the action for <code>setMetaKeywords</code></p>
     * @param change value to be set
     */
    
    public void setChange(final String change);
    
    
    /**
     * set previousValue
     * @param previousValue value to be set
     */
    
    public void setPreviousValue(final LocalizedString previousValue);
    
    
    /**
     * set nextValue
     * @param nextValue value to be set
     */
    
    public void setNextValue(final LocalizedString nextValue);
    

    /**
     * factory method
     * @return instance of SetMetaKeywordsChange
     */
    public static SetMetaKeywordsChange of(){
        return new SetMetaKeywordsChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy SetMetaKeywordsChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetMetaKeywordsChange of(final SetMetaKeywordsChange template) {
        SetMetaKeywordsChangeImpl instance = new SetMetaKeywordsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetMetaKeywordsChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetMetaKeywordsChange deepCopy(@Nullable final SetMetaKeywordsChange template) {
        if (template == null) {
            return null;
        }
        SetMetaKeywordsChangeImpl instance = new SetMetaKeywordsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetMetaKeywordsChange
     * @return builder
     */
    public static SetMetaKeywordsChangeBuilder builder() {
        return SetMetaKeywordsChangeBuilder.of();
    }
    
    /**
     * create builder for SetMetaKeywordsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetMetaKeywordsChangeBuilder builder(final SetMetaKeywordsChange template) {
        return SetMetaKeywordsChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetMetaKeywordsChange(Function<SetMetaKeywordsChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetMetaKeywordsChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetMetaKeywordsChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetMetaKeywordsChange>";
            }
        };
    }
}
