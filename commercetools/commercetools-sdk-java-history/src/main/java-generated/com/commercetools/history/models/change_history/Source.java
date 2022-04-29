
package com.commercetools.history.models.change_history;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Values for the Source enumeration.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface Source {

    Source MERCHANT_CENTER = SourceEnum.MERCHANT_CENTER;

    Source IMP_EX = SourceEnum.IMP_EX;

    Source API_CLIENT = SourceEnum.API_CLIENT;

    enum SourceEnum implements Source {
        MERCHANT_CENTER("MerchantCenter"),

        IMP_EX("ImpEx"),

        API_CLIENT("ApiClient");
        private final String jsonName;

        private SourceEnum(final String jsonName) {
            this.jsonName = jsonName;
        }

        public String getJsonName() {
            return jsonName;
        }

        public String toString() {
            return jsonName;
        }
    }

    @JsonValue
    String getJsonName();

    String name();

    String toString();

    @JsonCreator
    public static Source findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new Source() {
            @Override
            public String getJsonName() {
                return value;
            }

            @Override
            public String name() {
                return value.toUpperCase();
            }

            public String toString() {
                return value;
            }
        });
    }

    public static Optional<Source> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static Source[] values() {
        return SourceEnum.values();
    }
}
