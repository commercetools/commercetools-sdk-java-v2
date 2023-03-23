
package com.commercetools.api.models.attribute_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeGroupSetAttributesAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeGroupSetAttributesAction attributeGroupSetAttributesAction = AttributeGroupSetAttributesAction.builder()
 *             .plusAttributes(attributesBuilder -> attributesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeGroupSetAttributesActionImpl.class)
public interface AttributeGroupSetAttributesAction extends AttributeGroupUpdateAction {

    String SET_ATTRIBUTES = "setAttributes";

    /**
     *  <p>New unique values to set.</p>
     * @return attributes
     */
    @NotNull
    @Valid
    @JsonProperty("attributes")
    public List<AttributeReference> getAttributes();

    @JsonIgnore
    public void setAttributes(final AttributeReference... attributes);

    public void setAttributes(final List<AttributeReference> attributes);

    public static AttributeGroupSetAttributesAction of() {
        return new AttributeGroupSetAttributesActionImpl();
    }

    public static AttributeGroupSetAttributesAction of(final AttributeGroupSetAttributesAction template) {
        AttributeGroupSetAttributesActionImpl instance = new AttributeGroupSetAttributesActionImpl();
        instance.setAttributes(template.getAttributes());
        return instance;
    }

    public static AttributeGroupSetAttributesActionBuilder builder() {
        return AttributeGroupSetAttributesActionBuilder.of();
    }

    public static AttributeGroupSetAttributesActionBuilder builder(final AttributeGroupSetAttributesAction template) {
        return AttributeGroupSetAttributesActionBuilder.of(template);
    }

    default <T> T withAttributeGroupSetAttributesAction(Function<AttributeGroupSetAttributesAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AttributeGroupSetAttributesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeGroupSetAttributesAction>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeGroupSetAttributesAction>";
            }
        };
    }
}
