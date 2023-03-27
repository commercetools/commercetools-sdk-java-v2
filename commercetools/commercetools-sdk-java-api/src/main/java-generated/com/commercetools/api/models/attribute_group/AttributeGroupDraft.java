
package com.commercetools.api.models.attribute_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeGroupDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeGroupDraft attributeGroupDraft = AttributeGroupDraft.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .plusAttributes(attributesBuilder -> attributesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeGroupDraftImpl.class)
public interface AttributeGroupDraft
        extends com.commercetools.api.models.WithKey, io.vrap.rmf.base.client.Draft<AttributeGroupDraft> {

    /**
     *  <p>Name of the AttributeGroup.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Description of the AttributeGroup.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Attributes with unique values.</p>
     * @return attributes
     */
    @NotNull
    @Valid
    @JsonProperty("attributes")
    public List<AttributeReference> getAttributes();

    /**
     *  <p>User-defined unique identifier for the AttributeGroup.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Name of the AttributeGroup.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Description of the AttributeGroup.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     *  <p>Attributes with unique values.</p>
     * @param attributes values to be set
     */

    @JsonIgnore
    public void setAttributes(final AttributeReference... attributes);

    /**
     *  <p>Attributes with unique values.</p>
     * @param attributes values to be set
     */

    public void setAttributes(final List<AttributeReference> attributes);

    /**
     *  <p>User-defined unique identifier for the AttributeGroup.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of AttributeGroupDraft
     */
    public static AttributeGroupDraft of() {
        return new AttributeGroupDraftImpl();
    }

    /**
     * factory method to copy an instance of AttributeGroupDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static AttributeGroupDraft of(final AttributeGroupDraft template) {
        AttributeGroupDraftImpl instance = new AttributeGroupDraftImpl();
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setAttributes(template.getAttributes());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for AttributeGroupDraft
     * @return builder
     */
    public static AttributeGroupDraftBuilder builder() {
        return AttributeGroupDraftBuilder.of();
    }

    /**
     * create builder for AttributeGroupDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeGroupDraftBuilder builder(final AttributeGroupDraft template) {
        return AttributeGroupDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributeGroupDraft(Function<AttributeGroupDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AttributeGroupDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeGroupDraft>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeGroupDraft>";
            }
        };
    }
}
