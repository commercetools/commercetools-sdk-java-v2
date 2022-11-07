
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
public interface AttributeGroupDraft {

    /**
     *  <p>Name of the AttributeGroup.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Description of the AttributeGroup.</p>
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Attributes with unique values.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("attributes")
    public List<AttributeReference> getAttributes();

    /**
     *  <p>User-defined unique identifier for the AttributeGroup.</p>
     */

    @JsonProperty("key")
    public String getKey();

    public void setName(final LocalizedString name);

    public void setDescription(final LocalizedString description);

    @JsonIgnore
    public void setAttributes(final AttributeReference... attributes);

    public void setAttributes(final List<AttributeReference> attributes);

    public void setKey(final String key);

    public static AttributeGroupDraft of() {
        return new AttributeGroupDraftImpl();
    }

    public static AttributeGroupDraft of(final AttributeGroupDraft template) {
        AttributeGroupDraftImpl instance = new AttributeGroupDraftImpl();
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setAttributes(template.getAttributes());
        instance.setKey(template.getKey());
        return instance;
    }

    public static AttributeGroupDraftBuilder builder() {
        return AttributeGroupDraftBuilder.of();
    }

    public static AttributeGroupDraftBuilder builder(final AttributeGroupDraft template) {
        return AttributeGroupDraftBuilder.of(template);
    }

    default <T> T withAttributeGroupDraft(Function<AttributeGroupDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AttributeGroupDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeGroupDraft>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeGroupDraft>";
            }
        };
    }
}
