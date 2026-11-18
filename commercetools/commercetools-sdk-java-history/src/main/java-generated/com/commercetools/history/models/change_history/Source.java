
package com.commercetools.history.models.change_history;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Source of change for the resource.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface Source extends JsonEnum {

    /**
    <p>The change was made by a manual edit through the Merchant Center. To see changes made by agents, filter by the specific agent source instead.</p> */
    Source MERCHANT_CENTER = SourceEnum.MERCHANT_CENTER;
    /**
    <p>The change was made through the now-decommissioned ImpEx tool.</p>
    <p>For changes made before October 22nd, 2026, this matches any change that does not have a <code>MerchantCenter</code> or <code>ApiClient</code> source. For changes made on or after October 22nd, 2026, this matches only changes with direct <code>Import</code> or <code>Export</code> attribution. Use <code>Import</code> or <code>Export</code> instead.</p> */
    Source IMP_EX = SourceEnum.IMP_EX;
    /**
    <p>The change was made through an API Client. Also returns changes made through <code>Import</code>, <code>Export</code>, or the Managed Commerce MCP when using Client IDs.</p> */
    Source API_CLIENT = SourceEnum.API_CLIENT;
    /**
    <p>The change was made during an import.</p> */
    Source IMPORT = SourceEnum.IMPORT;
    /**
    <p>The change was made during an export.</p> */
    Source EXPORT = SourceEnum.EXPORT;
    /**
    <p>The change was made by the Intake Agent.</p> */
    Source INTAKE_AGENT = SourceEnum.INTAKE_AGENT;
    /**
    <p>The change was made by the Promotions Agent.</p> */
    Source PROMOTIONS_AGENT = SourceEnum.PROMOTIONS_AGENT;
    /**
    <p>The change was made through the Managed Commerce MCP.</p> */
    Source MANAGED_COMMERCE_MCP = SourceEnum.MANAGED_COMMERCE_MCP;
    /**
    <p>The change was made by the Product Enrichment Agent. This value is available in early access.</p> */
    Source PRODUCT_ENRICHMENT_AGENT = SourceEnum.PRODUCT_ENRICHMENT_AGENT;

    /**
     * possible values of Source
     */
    enum SourceEnum implements Source {
        /**
         * MerchantCenter
         */
        MERCHANT_CENTER("MerchantCenter"),

        /**
         * ImpEx
         */
        IMP_EX("ImpEx"),

        /**
         * ApiClient
         */
        API_CLIENT("ApiClient"),

        /**
         * Import
         */
        IMPORT("Import"),

        /**
         * Export
         */
        EXPORT("Export"),

        /**
         * IntakeAgent
         */
        INTAKE_AGENT("IntakeAgent"),

        /**
         * PromotionsAgent
         */
        PROMOTIONS_AGENT("PromotionsAgent"),

        /**
         * ManagedCommerceMCP
         */
        MANAGED_COMMERCE_MCP("ManagedCommerceMCP"),

        /**
         * ProductEnrichmentAgent
         */
        PRODUCT_ENRICHMENT_AGENT("ProductEnrichmentAgent");
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

    /**
     * the JSON value
     * @return json value
     */
    @JsonValue
    String getJsonName();

    /**
     * the enum value
     * @return name
     */
    String name();

    /**
     * convert value to string
     * @return string representation
     */
    String toString();

    /**
     * factory method for a enum value of Source
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
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

    /**
     * method to find enum using the JSON value
     * @param jsonName the json value to be wrapped
     * @return optional of enum instance
     */
    public static Optional<Source> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static Source[] values() {
        return SourceEnum.values();
    }

}
