
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.Attribute;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when the <code>Unique</code> AttributeConstraint criteria are not met during an Update Product request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DuplicateAttributeValueError duplicateAttributeValueError = DuplicateAttributeValueError.builder()
 *             .message("{message}")
 *             .attribute(attributeBuilder -> attributeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DuplicateAttributeValueErrorImpl.class)
public interface DuplicateAttributeValueError extends ErrorObject {

    String DUPLICATE_ATTRIBUTE_VALUE = "DuplicateAttributeValue";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Attribute can't have the same value in a different variant."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Conflicting Attributes.</p>
     * @return attribute
     */
    @NotNull
    @Valid
    @JsonProperty("attribute")
    public Attribute getAttribute();

    public void setMessage(final String message);

    public void setAttribute(final Attribute attribute);

    public static DuplicateAttributeValueError of() {
        return new DuplicateAttributeValueErrorImpl();
    }

    public static DuplicateAttributeValueError of(final DuplicateAttributeValueError template) {
        DuplicateAttributeValueErrorImpl instance = new DuplicateAttributeValueErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setAttribute(template.getAttribute());
        return instance;
    }

    public static DuplicateAttributeValueErrorBuilder builder() {
        return DuplicateAttributeValueErrorBuilder.of();
    }

    public static DuplicateAttributeValueErrorBuilder builder(final DuplicateAttributeValueError template) {
        return DuplicateAttributeValueErrorBuilder.of(template);
    }

    default <T> T withDuplicateAttributeValueError(Function<DuplicateAttributeValueError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DuplicateAttributeValueError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DuplicateAttributeValueError>() {
            @Override
            public String toString() {
                return "TypeReference<DuplicateAttributeValueError>";
            }
        };
    }
}
