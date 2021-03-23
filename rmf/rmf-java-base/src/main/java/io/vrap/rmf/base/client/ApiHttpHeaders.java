
package io.vrap.rmf.base.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

public class ApiHttpHeaders extends Base {

    public static class StringHeaderEntry extends HeaderEntry<String, String> {
        public StringHeaderEntry(final String key) {
            super(key);
        }

        public StringHeaderEntry(final String key, final String value) {
            super(key, value);
        }
    }

    public static class HeaderEntry<K, V> extends Base implements Map.Entry<K, V> {
        protected final K key;
        protected V value;

        public HeaderEntry(final K key) {
            this.key = key;
        }

        public HeaderEntry(final K key, final V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(final V value) {
            V oldValue = this.value;
            this.value = value;
            return oldValue;
        }

        @Override
        public String toString() {
            if (key.toString().equalsIgnoreCase(AUTHORIZATION)) {
                return "{key=" + key + ", value=**removed from output**}";
            }
            return "{" + "key=" + key + ", value=" + value + '}';
        }
    }

    public static StringHeaderEntry headerEntry(final String key) {
        return new StringHeaderEntry(key);
    }

    public static StringHeaderEntry headerEntry(final String key, final String value) {
        return new StringHeaderEntry(key, value);
    }

    public static final String ACCEPT_ENCODING = "Accept-Encoding";
    public static final String AUTHORIZATION = "Authorization";
    public static final String USER_AGENT = "User-Agent";
    public static final String CONTENT_ENCODING = "Content-Encoding";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String CONTENT_LENGTH = "Content-Length";
    public static final String X_CORRELATION_ID = "X-Correlation-ID";
    public static final String X_DEPRECATION_NOTICE = "X-Deprecation-Notice";

    private final List<StringHeaderEntry> headers;

    public ApiHttpHeaders() {
        this.headers = new ArrayList<>();
    }

    public ApiHttpHeaders(final StringHeaderEntry... headers) {
        this.headers = new ArrayList<>(Arrays.asList(headers));
    }

    public ApiHttpHeaders(final List<Map.Entry<String, String>> headers) {
        this.headers = mapToHeaderEntries(headers);
    }

    public ApiHttpHeaders(final ApiHttpHeaders t) {
        this.headers = new ArrayList<>(t.headers);
    }

    public ApiHttpHeaders addHeader(final String key, final String value) {
        ApiHttpHeaders headers = copy();
        headers.headers.add(headerEntry(key, value));

        return headers;
    }

    public ApiHttpHeaders withHeader(final String key, final String value) {
        ApiHttpHeaders headers = withoutHeader(key);
        headers.headers.add(headerEntry(key, value));
        return headers;
    }

    public final ApiHttpHeaders withHeaders(final StringHeaderEntry... headers) {
        return new ApiHttpHeaders(new ArrayList<>(Arrays.asList(headers)));
    }

    public ApiHttpHeaders withHeaders(final List<Map.Entry<String, String>> headers) {
        return new ApiHttpHeaders(headers);
    }

    public ApiHttpHeaders withoutHeader(final String key) {
        return withHeaders(
            headers.stream().filter(e -> !e.getKey().equalsIgnoreCase(key)).collect(Collectors.toList()));
    }

    @Nullable
    public String getFirst(final String key) {
        return this.headers.stream()
                .filter(e -> e.getKey().equalsIgnoreCase(key))
                .map(Map.Entry::getValue)
                .findFirst()
                .orElse(null);
    }

    public List<String> getHeaderValue(final String key) {
        return headers.stream()
                .filter(e -> e.getKey().equalsIgnoreCase(key))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
    }

    public List<Map.Entry<String, String>> getHeaders(final String key) {
        return headers.stream().filter(e -> e.getKey().equalsIgnoreCase(key)).collect(Collectors.toList());
    }

    public List<Map.Entry<String, String>> getHeaders() {
        return new ArrayList<>(headers);
    }

    @Override
    public String toString() {
        return headers.toString();
    }

    private ApiHttpHeaders copy() {
        return new ApiHttpHeaders(this);
    }

    private static List<StringHeaderEntry> mapToHeaderEntries(final List<Map.Entry<String, String>> entries) {
        return entries.stream().map(ApiHttpHeaders::mapToHeaderEntry).collect(Collectors.toList());
    }

    private static StringHeaderEntry mapToHeaderEntry(final Map.Entry<String, String> entry) {
        if (entry instanceof StringHeaderEntry) {
            return (StringHeaderEntry) entry;
        }
        return headerEntry(entry.getKey(), entry.getValue());
    }
}
