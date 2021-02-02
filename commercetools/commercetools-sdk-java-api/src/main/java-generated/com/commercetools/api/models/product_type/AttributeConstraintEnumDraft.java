
package com.commercetools.api.models.product_type;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface AttributeConstraintEnumDraft {

    AttributeConstraintEnumDraft NONE = AttributeConstraintEnumDraftEnum.NONE;

    enum AttributeConstraintEnumDraftEnum implements AttributeConstraintEnumDraft {
        NONE("None");
        private final String jsonName;

        private AttributeConstraintEnumDraftEnum(final String jsonName) {
            this.jsonName = jsonName;
        }

        public String getJsonName() {
            return jsonName;
        }
    }

    @JsonValue
    String getJsonName();

    String name();

    @JsonCreator
    public static AttributeConstraintEnumDraft findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new AttributeConstraintEnumDraft() {
            @Override
            public String getJsonName() {
                return value;
            }

            @Override
            public String name() {
                return value.toUpperCase();
            }
        });
    }

    public static Optional<AttributeConstraintEnumDraft> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static AttributeConstraintEnumDraft[] values() {
        return AttributeConstraintEnumDraftEnum.values();
    }
}
