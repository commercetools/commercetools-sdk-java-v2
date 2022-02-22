
package com.commercetools.api.models.project;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Status of resource indexing.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface SearchIndexingConfigurationStatus {

    /**
    	<p>Indicates that search and suggest endpoints for the specified resource type are active.</p>

    */
    SearchIndexingConfigurationStatus ACTIVATED = SearchIndexingConfigurationStatusEnum.ACTIVATED;
    /**
    	<p>Indicates that search and suggest endpoints for the specified resource type cannot be used.</p>

    */
    SearchIndexingConfigurationStatus DEACTIVATED = SearchIndexingConfigurationStatusEnum.DEACTIVATED;
    /**
    	<p>Indicates that search and suggest endpoints can <em>temporarily</em> not be used because the search index is being re-built.</p>

    */
    SearchIndexingConfigurationStatus INDEXING = SearchIndexingConfigurationStatusEnum.INDEXING;

    enum SearchIndexingConfigurationStatusEnum implements SearchIndexingConfigurationStatus {
        ACTIVATED("Activated"),

        DEACTIVATED("Deactivated"),

        INDEXING("Indexing");
        private final String jsonName;

        private SearchIndexingConfigurationStatusEnum(final String jsonName) {
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
    public static SearchIndexingConfigurationStatus findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new SearchIndexingConfigurationStatus() {
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

    public static Optional<SearchIndexingConfigurationStatus> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static SearchIndexingConfigurationStatus[] values() {
        return SearchIndexingConfigurationStatusEnum.values();
    }
}
