
package com.jdk.odds.hander.result;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "language",
    "region",
    "quoteType",
    "triggerable",
    "quoteSummary",
    "components",
    "currency",
    "firstTradeDateMilliseconds",
    "priceHint",
    "totalCash",
    "floatShares",
    "ebitda",
    "targetPriceHigh",
    "targetPriceLow",
    "targetPriceMean",
    "targetPriceMedian",
    "heldPercentInsiders",
    "heldPercentInstitutions",
    "regularMarketChange",
    "regularMarketChangePercent",
    "regularMarketTime",
    "regularMarketPrice",
    "regularMarketDayHigh",
    "regularMarketDayRange",
    "regularMarketDayLow",
    "regularMarketVolume",
    "regularMarketPreviousClose",
    "bid",
    "ask",
    "bidSize",
    "askSize",
    "exchange",
    "market",
    "messageBoardId",
    "fullExchangeName",
    "shortName",
    "longName",
    "regularMarketOpen",
    "averageDailyVolume3Month",
    "averageDailyVolume10Day",
    "beta",
    "fiftyTwoWeekLowChange",
    "fiftyTwoWeekLowChangePercent",
    "fiftyTwoWeekRange",
    "fiftyTwoWeekHighChange",
    "fiftyTwoWeekHighChangePercent",
    "fiftyTwoWeekLow",
    "fiftyTwoWeekHigh",
    "exDividendDate",
    "earningsTimestamp",
    "earningsTimestampStart",
    "earningsTimestampEnd",
    "trailingAnnualDividendRate",
    "trailingPE",
    "dividendsPerShare",
    "dividendRate",
    "trailingAnnualDividendYield",
    "dividendYield",
    "revenue",
    "priceToSales",
    "marketState",
    "epsTrailingTwelveMonths",
    "epsForward",
    "sharesOutstanding",
    "bookValue",
    "fiftyDayAverage",
    "fiftyDayAverageChange",
    "fiftyDayAverageChangePercent",
    "twoHundredDayAverage",
    "twoHundredDayAverageChange",
    "twoHundredDayAverageChangePercent",
    "marketCap",
    "forwardPE",
    "priceToBook",
    "sourceInterval",
    "exchangeDataDelayedBy",
    "exchangeTimezoneName",
    "exchangeTimezoneShortName",
    "gmtOffSetMilliseconds",
    "esgPopulated",
    "tradeable",
    "symbol"
})
public class Result {

    @JsonProperty("language")
    private String language;
    @JsonProperty("region")
    private String region;
    @JsonProperty("quoteType")
    private String quoteType;
    @JsonProperty("triggerable")
    private Boolean triggerable;
    @JsonProperty("quoteSummary")
    private QuoteSummary quoteSummary;
    @JsonProperty("components")
    private List<String> components = null;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("firstTradeDateMilliseconds")
    private Integer firstTradeDateMilliseconds;
    @JsonProperty("priceHint")
    private Integer priceHint;
    @JsonProperty("totalCash")
    private Double totalCash;
    @JsonProperty("floatShares")
    private Integer floatShares;
    @JsonProperty("ebitda")
    private Integer ebitda;
    @JsonProperty("targetPriceHigh")
    private Double targetPriceHigh;
    @JsonProperty("targetPriceLow")
    private Double targetPriceLow;
    @JsonProperty("targetPriceMean")
    private Double targetPriceMean;
    @JsonProperty("targetPriceMedian")
    private Double targetPriceMedian;
    @JsonProperty("heldPercentInsiders")
    private Double heldPercentInsiders;
    @JsonProperty("heldPercentInstitutions")
    private Double heldPercentInstitutions;
    @JsonProperty("regularMarketChange")
    private Double regularMarketChange;
    @JsonProperty("regularMarketChangePercent")
    private Double regularMarketChangePercent;
    @JsonProperty("regularMarketTime")
    private Integer regularMarketTime;
    @JsonProperty("regularMarketPrice")
    private Double regularMarketPrice;
    @JsonProperty("regularMarketDayHigh")
    private Double regularMarketDayHigh;
    @JsonProperty("regularMarketDayRange")
    private String regularMarketDayRange;
    @JsonProperty("regularMarketDayLow")
    private Double regularMarketDayLow;
    @JsonProperty("regularMarketVolume")
    private Integer regularMarketVolume;
    @JsonProperty("regularMarketPreviousClose")
    private Double regularMarketPreviousClose;
    @JsonProperty("bid")
    private Double bid;
    @JsonProperty("ask")
    private Double ask;
    @JsonProperty("bidSize")
    private Integer bidSize;
    @JsonProperty("askSize")
    private Integer askSize;
    @JsonProperty("exchange")
    private String exchange;
    @JsonProperty("market")
    private String market;
    @JsonProperty("messageBoardId")
    private String messageBoardId;
    @JsonProperty("fullExchangeName")
    private String fullExchangeName;
    @JsonProperty("shortName")
    private String shortName;
    @JsonProperty("longName")
    private String longName;
    @JsonProperty("regularMarketOpen")
    private Double regularMarketOpen;
    @JsonProperty("averageDailyVolume3Month")
    private Integer averageDailyVolume3Month;
    @JsonProperty("averageDailyVolume10Day")
    private Integer averageDailyVolume10Day;
    @JsonProperty("beta")
    private Double beta;
    @JsonProperty("fiftyTwoWeekLowChange")
    private Double fiftyTwoWeekLowChange;
    @JsonProperty("fiftyTwoWeekLowChangePercent")
    private Double fiftyTwoWeekLowChangePercent;
    @JsonProperty("fiftyTwoWeekRange")
    private String fiftyTwoWeekRange;
    @JsonProperty("fiftyTwoWeekHighChange")
    private Double fiftyTwoWeekHighChange;
    @JsonProperty("fiftyTwoWeekHighChangePercent")
    private Double fiftyTwoWeekHighChangePercent;
    @JsonProperty("fiftyTwoWeekLow")
    private Double fiftyTwoWeekLow;
    @JsonProperty("fiftyTwoWeekHigh")
    private Double fiftyTwoWeekHigh;
    @JsonProperty("exDividendDate")
    private Integer exDividendDate;
    @JsonProperty("earningsTimestamp")
    private Integer earningsTimestamp;
    @JsonProperty("earningsTimestampStart")
    private Integer earningsTimestampStart;
    @JsonProperty("earningsTimestampEnd")
    private Integer earningsTimestampEnd;
    @JsonProperty("trailingAnnualDividendRate")
    private Double trailingAnnualDividendRate;
    @JsonProperty("trailingPE")
    private Double trailingPE;
    @JsonProperty("dividendsPerShare")
    private Double dividendsPerShare;
    @JsonProperty("dividendRate")
    private Double dividendRate;
    @JsonProperty("trailingAnnualDividendYield")
    private Double trailingAnnualDividendYield;
    @JsonProperty("dividendYield")
    private Double dividendYield;
    @JsonProperty("revenue")
    private Double revenue;
    @JsonProperty("priceToSales")
    private Double priceToSales;
    @JsonProperty("marketState")
    private String marketState;
    @JsonProperty("epsTrailingTwelveMonths")
    private Double epsTrailingTwelveMonths;
    @JsonProperty("epsForward")
    private Double epsForward;
    @JsonProperty("sharesOutstanding")
    private Integer sharesOutstanding;
    @JsonProperty("bookValue")
    private Double bookValue;
    @JsonProperty("fiftyDayAverage")
    private Double fiftyDayAverage;
    @JsonProperty("fiftyDayAverageChange")
    private Double fiftyDayAverageChange;
    @JsonProperty("fiftyDayAverageChangePercent")
    private Double fiftyDayAverageChangePercent;
    @JsonProperty("twoHundredDayAverage")
    private Double twoHundredDayAverage;
    @JsonProperty("twoHundredDayAverageChange")
    private Double twoHundredDayAverageChange;
    @JsonProperty("twoHundredDayAverageChangePercent")
    private Double twoHundredDayAverageChangePercent;
    @JsonProperty("marketCap")
    private Integer marketCap;
    @JsonProperty("forwardPE")
    private Double forwardPE;
    @JsonProperty("priceToBook")
    private Double priceToBook;
    @JsonProperty("sourceInterval")
    private Integer sourceInterval;
    @JsonProperty("exchangeDataDelayedBy")
    private Integer exchangeDataDelayedBy;
    @JsonProperty("exchangeTimezoneName")
    private String exchangeTimezoneName;
    @JsonProperty("exchangeTimezoneShortName")
    private String exchangeTimezoneShortName;
    @JsonProperty("gmtOffSetMilliseconds")
    private Integer gmtOffSetMilliseconds;
    @JsonProperty("esgPopulated")
    private Boolean esgPopulated;
    @JsonProperty("tradeable")
    private Boolean tradeable;
    @JsonProperty("symbol")
    private String symbol;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    @JsonProperty("quoteType")
    public String getQuoteType() {
        return quoteType;
    }

    @JsonProperty("quoteType")
    public void setQuoteType(String quoteType) {
        this.quoteType = quoteType;
    }

    @JsonProperty("triggerable")
    public Boolean getTriggerable() {
        return triggerable;
    }

    @JsonProperty("triggerable")
    public void setTriggerable(Boolean triggerable) {
        this.triggerable = triggerable;
    }

    @JsonProperty("quoteSummary")
    public QuoteSummary getQuoteSummary() {
        return quoteSummary;
    }

    @JsonProperty("quoteSummary")
    public void setQuoteSummary(QuoteSummary quoteSummary) {
        this.quoteSummary = quoteSummary;
    }

    @JsonProperty("components")
    public List<String> getComponents() {
        return components;
    }

    @JsonProperty("components")
    public void setComponents(List<String> components) {
        this.components = components;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("firstTradeDateMilliseconds")
    public Integer getFirstTradeDateMilliseconds() {
        return firstTradeDateMilliseconds;
    }

    @JsonProperty("firstTradeDateMilliseconds")
    public void setFirstTradeDateMilliseconds(Integer firstTradeDateMilliseconds) {
        this.firstTradeDateMilliseconds = firstTradeDateMilliseconds;
    }

    @JsonProperty("priceHint")
    public Integer getPriceHint() {
        return priceHint;
    }

    @JsonProperty("priceHint")
    public void setPriceHint(Integer priceHint) {
        this.priceHint = priceHint;
    }

    @JsonProperty("totalCash")
    public Double getTotalCash() {
        return totalCash;
    }

    @JsonProperty("totalCash")
    public void setTotalCash(Double totalCash) {
        this.totalCash = totalCash;
    }

    @JsonProperty("floatShares")
    public Integer getFloatShares() {
        return floatShares;
    }

    @JsonProperty("floatShares")
    public void setFloatShares(Integer floatShares) {
        this.floatShares = floatShares;
    }

    @JsonProperty("ebitda")
    public Integer getEbitda() {
        return ebitda;
    }

    @JsonProperty("ebitda")
    public void setEbitda(Integer ebitda) {
        this.ebitda = ebitda;
    }

    @JsonProperty("targetPriceHigh")
    public Double getTargetPriceHigh() {
        return targetPriceHigh;
    }

    @JsonProperty("targetPriceHigh")
    public void setTargetPriceHigh(Double targetPriceHigh) {
        this.targetPriceHigh = targetPriceHigh;
    }

    @JsonProperty("targetPriceLow")
    public Double getTargetPriceLow() {
        return targetPriceLow;
    }

    @JsonProperty("targetPriceLow")
    public void setTargetPriceLow(Double targetPriceLow) {
        this.targetPriceLow = targetPriceLow;
    }

    @JsonProperty("targetPriceMean")
    public Double getTargetPriceMean() {
        return targetPriceMean;
    }

    @JsonProperty("targetPriceMean")
    public void setTargetPriceMean(Double targetPriceMean) {
        this.targetPriceMean = targetPriceMean;
    }

    @JsonProperty("targetPriceMedian")
    public Double getTargetPriceMedian() {
        return targetPriceMedian;
    }

    @JsonProperty("targetPriceMedian")
    public void setTargetPriceMedian(Double targetPriceMedian) {
        this.targetPriceMedian = targetPriceMedian;
    }

    @JsonProperty("heldPercentInsiders")
    public Double getHeldPercentInsiders() {
        return heldPercentInsiders;
    }

    @JsonProperty("heldPercentInsiders")
    public void setHeldPercentInsiders(Double heldPercentInsiders) {
        this.heldPercentInsiders = heldPercentInsiders;
    }

    @JsonProperty("heldPercentInstitutions")
    public Double getHeldPercentInstitutions() {
        return heldPercentInstitutions;
    }

    @JsonProperty("heldPercentInstitutions")
    public void setHeldPercentInstitutions(Double heldPercentInstitutions) {
        this.heldPercentInstitutions = heldPercentInstitutions;
    }

    @JsonProperty("regularMarketChange")
    public Double getRegularMarketChange() {
        return regularMarketChange;
    }

    @JsonProperty("regularMarketChange")
    public void setRegularMarketChange(Double regularMarketChange) {
        this.regularMarketChange = regularMarketChange;
    }

    @JsonProperty("regularMarketChangePercent")
    public Double getRegularMarketChangePercent() {
        return regularMarketChangePercent;
    }

    @JsonProperty("regularMarketChangePercent")
    public void setRegularMarketChangePercent(Double regularMarketChangePercent) {
        this.regularMarketChangePercent = regularMarketChangePercent;
    }

    @JsonProperty("regularMarketTime")
    public Integer getRegularMarketTime() {
        return regularMarketTime;
    }

    @JsonProperty("regularMarketTime")
    public void setRegularMarketTime(Integer regularMarketTime) {
        this.regularMarketTime = regularMarketTime;
    }

    @JsonProperty("regularMarketPrice")
    public Double getRegularMarketPrice() {
        return regularMarketPrice;
    }

    @JsonProperty("regularMarketPrice")
    public void setRegularMarketPrice(Double regularMarketPrice) {
        this.regularMarketPrice = regularMarketPrice;
    }

    @JsonProperty("regularMarketDayHigh")
    public Double getRegularMarketDayHigh() {
        return regularMarketDayHigh;
    }

    @JsonProperty("regularMarketDayHigh")
    public void setRegularMarketDayHigh(Double regularMarketDayHigh) {
        this.regularMarketDayHigh = regularMarketDayHigh;
    }

    @JsonProperty("regularMarketDayRange")
    public String getRegularMarketDayRange() {
        return regularMarketDayRange;
    }

    @JsonProperty("regularMarketDayRange")
    public void setRegularMarketDayRange(String regularMarketDayRange) {
        this.regularMarketDayRange = regularMarketDayRange;
    }

    @JsonProperty("regularMarketDayLow")
    public Double getRegularMarketDayLow() {
        return regularMarketDayLow;
    }

    @JsonProperty("regularMarketDayLow")
    public void setRegularMarketDayLow(Double regularMarketDayLow) {
        this.regularMarketDayLow = regularMarketDayLow;
    }

    @JsonProperty("regularMarketVolume")
    public Integer getRegularMarketVolume() {
        return regularMarketVolume;
    }

    @JsonProperty("regularMarketVolume")
    public void setRegularMarketVolume(Integer regularMarketVolume) {
        this.regularMarketVolume = regularMarketVolume;
    }

    @JsonProperty("regularMarketPreviousClose")
    public Double getRegularMarketPreviousClose() {
        return regularMarketPreviousClose;
    }

    @JsonProperty("regularMarketPreviousClose")
    public void setRegularMarketPreviousClose(Double regularMarketPreviousClose) {
        this.regularMarketPreviousClose = regularMarketPreviousClose;
    }

    @JsonProperty("bid")
    public Double getBid() {
        return bid;
    }

    @JsonProperty("bid")
    public void setBid(Double bid) {
        this.bid = bid;
    }

    @JsonProperty("ask")
    public Double getAsk() {
        return ask;
    }

    @JsonProperty("ask")
    public void setAsk(Double ask) {
        this.ask = ask;
    }

    @JsonProperty("bidSize")
    public Integer getBidSize() {
        return bidSize;
    }

    @JsonProperty("bidSize")
    public void setBidSize(Integer bidSize) {
        this.bidSize = bidSize;
    }

    @JsonProperty("askSize")
    public Integer getAskSize() {
        return askSize;
    }

    @JsonProperty("askSize")
    public void setAskSize(Integer askSize) {
        this.askSize = askSize;
    }

    @JsonProperty("exchange")
    public String getExchange() {
        return exchange;
    }

    @JsonProperty("exchange")
    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    @JsonProperty("market")
    public String getMarket() {
        return market;
    }

    @JsonProperty("market")
    public void setMarket(String market) {
        this.market = market;
    }

    @JsonProperty("messageBoardId")
    public String getMessageBoardId() {
        return messageBoardId;
    }

    @JsonProperty("messageBoardId")
    public void setMessageBoardId(String messageBoardId) {
        this.messageBoardId = messageBoardId;
    }

    @JsonProperty("fullExchangeName")
    public String getFullExchangeName() {
        return fullExchangeName;
    }

    @JsonProperty("fullExchangeName")
    public void setFullExchangeName(String fullExchangeName) {
        this.fullExchangeName = fullExchangeName;
    }

    @JsonProperty("shortName")
    public String getShortName() {
        return shortName;
    }

    @JsonProperty("shortName")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @JsonProperty("longName")
    public String getLongName() {
        return longName;
    }

    @JsonProperty("longName")
    public void setLongName(String longName) {
        this.longName = longName;
    }

    @JsonProperty("regularMarketOpen")
    public Double getRegularMarketOpen() {
        return regularMarketOpen;
    }

    @JsonProperty("regularMarketOpen")
    public void setRegularMarketOpen(Double regularMarketOpen) {
        this.regularMarketOpen = regularMarketOpen;
    }

    @JsonProperty("averageDailyVolume3Month")
    public Integer getAverageDailyVolume3Month() {
        return averageDailyVolume3Month;
    }

    @JsonProperty("averageDailyVolume3Month")
    public void setAverageDailyVolume3Month(Integer averageDailyVolume3Month) {
        this.averageDailyVolume3Month = averageDailyVolume3Month;
    }

    @JsonProperty("averageDailyVolume10Day")
    public Integer getAverageDailyVolume10Day() {
        return averageDailyVolume10Day;
    }

    @JsonProperty("averageDailyVolume10Day")
    public void setAverageDailyVolume10Day(Integer averageDailyVolume10Day) {
        this.averageDailyVolume10Day = averageDailyVolume10Day;
    }

    @JsonProperty("beta")
    public Double getBeta() {
        return beta;
    }

    @JsonProperty("beta")
    public void setBeta(Double beta) {
        this.beta = beta;
    }

    @JsonProperty("fiftyTwoWeekLowChange")
    public Double getFiftyTwoWeekLowChange() {
        return fiftyTwoWeekLowChange;
    }

    @JsonProperty("fiftyTwoWeekLowChange")
    public void setFiftyTwoWeekLowChange(Double fiftyTwoWeekLowChange) {
        this.fiftyTwoWeekLowChange = fiftyTwoWeekLowChange;
    }

    @JsonProperty("fiftyTwoWeekLowChangePercent")
    public Double getFiftyTwoWeekLowChangePercent() {
        return fiftyTwoWeekLowChangePercent;
    }

    @JsonProperty("fiftyTwoWeekLowChangePercent")
    public void setFiftyTwoWeekLowChangePercent(Double fiftyTwoWeekLowChangePercent) {
        this.fiftyTwoWeekLowChangePercent = fiftyTwoWeekLowChangePercent;
    }

    @JsonProperty("fiftyTwoWeekRange")
    public String getFiftyTwoWeekRange() {
        return fiftyTwoWeekRange;
    }

    @JsonProperty("fiftyTwoWeekRange")
    public void setFiftyTwoWeekRange(String fiftyTwoWeekRange) {
        this.fiftyTwoWeekRange = fiftyTwoWeekRange;
    }

    @JsonProperty("fiftyTwoWeekHighChange")
    public Double getFiftyTwoWeekHighChange() {
        return fiftyTwoWeekHighChange;
    }

    @JsonProperty("fiftyTwoWeekHighChange")
    public void setFiftyTwoWeekHighChange(Double fiftyTwoWeekHighChange) {
        this.fiftyTwoWeekHighChange = fiftyTwoWeekHighChange;
    }

    @JsonProperty("fiftyTwoWeekHighChangePercent")
    public Double getFiftyTwoWeekHighChangePercent() {
        return fiftyTwoWeekHighChangePercent;
    }

    @JsonProperty("fiftyTwoWeekHighChangePercent")
    public void setFiftyTwoWeekHighChangePercent(Double fiftyTwoWeekHighChangePercent) {
        this.fiftyTwoWeekHighChangePercent = fiftyTwoWeekHighChangePercent;
    }

    @JsonProperty("fiftyTwoWeekLow")
    public Double getFiftyTwoWeekLow() {
        return fiftyTwoWeekLow;
    }

    @JsonProperty("fiftyTwoWeekLow")
    public void setFiftyTwoWeekLow(Double fiftyTwoWeekLow) {
        this.fiftyTwoWeekLow = fiftyTwoWeekLow;
    }

    @JsonProperty("fiftyTwoWeekHigh")
    public Double getFiftyTwoWeekHigh() {
        return fiftyTwoWeekHigh;
    }

    @JsonProperty("fiftyTwoWeekHigh")
    public void setFiftyTwoWeekHigh(Double fiftyTwoWeekHigh) {
        this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
    }

    @JsonProperty("exDividendDate")
    public Integer getExDividendDate() {
        return exDividendDate;
    }

    @JsonProperty("exDividendDate")
    public void setExDividendDate(Integer exDividendDate) {
        this.exDividendDate = exDividendDate;
    }

    @JsonProperty("earningsTimestamp")
    public Integer getEarningsTimestamp() {
        return earningsTimestamp;
    }

    @JsonProperty("earningsTimestamp")
    public void setEarningsTimestamp(Integer earningsTimestamp) {
        this.earningsTimestamp = earningsTimestamp;
    }

    @JsonProperty("earningsTimestampStart")
    public Integer getEarningsTimestampStart() {
        return earningsTimestampStart;
    }

    @JsonProperty("earningsTimestampStart")
    public void setEarningsTimestampStart(Integer earningsTimestampStart) {
        this.earningsTimestampStart = earningsTimestampStart;
    }

    @JsonProperty("earningsTimestampEnd")
    public Integer getEarningsTimestampEnd() {
        return earningsTimestampEnd;
    }

    @JsonProperty("earningsTimestampEnd")
    public void setEarningsTimestampEnd(Integer earningsTimestampEnd) {
        this.earningsTimestampEnd = earningsTimestampEnd;
    }

    @JsonProperty("trailingAnnualDividendRate")
    public Double getTrailingAnnualDividendRate() {
        return trailingAnnualDividendRate;
    }

    @JsonProperty("trailingAnnualDividendRate")
    public void setTrailingAnnualDividendRate(Double trailingAnnualDividendRate) {
        this.trailingAnnualDividendRate = trailingAnnualDividendRate;
    }

    @JsonProperty("trailingPE")
    public Double getTrailingPE() {
        return trailingPE;
    }

    @JsonProperty("trailingPE")
    public void setTrailingPE(Double trailingPE) {
        this.trailingPE = trailingPE;
    }

    @JsonProperty("dividendsPerShare")
    public Double getDividendsPerShare() {
        return dividendsPerShare;
    }

    @JsonProperty("dividendsPerShare")
    public void setDividendsPerShare(Double dividendsPerShare) {
        this.dividendsPerShare = dividendsPerShare;
    }

    @JsonProperty("dividendRate")
    public Double getDividendRate() {
        return dividendRate;
    }

    @JsonProperty("dividendRate")
    public void setDividendRate(Double dividendRate) {
        this.dividendRate = dividendRate;
    }

    @JsonProperty("trailingAnnualDividendYield")
    public Double getTrailingAnnualDividendYield() {
        return trailingAnnualDividendYield;
    }

    @JsonProperty("trailingAnnualDividendYield")
    public void setTrailingAnnualDividendYield(Double trailingAnnualDividendYield) {
        this.trailingAnnualDividendYield = trailingAnnualDividendYield;
    }

    @JsonProperty("dividendYield")
    public Double getDividendYield() {
        return dividendYield;
    }

    @JsonProperty("dividendYield")
    public void setDividendYield(Double dividendYield) {
        this.dividendYield = dividendYield;
    }

    @JsonProperty("revenue")
    public Double getRevenue() {
        return revenue;
    }

    @JsonProperty("revenue")
    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    @JsonProperty("priceToSales")
    public Double getPriceToSales() {
        return priceToSales;
    }

    @JsonProperty("priceToSales")
    public void setPriceToSales(Double priceToSales) {
        this.priceToSales = priceToSales;
    }

    @JsonProperty("marketState")
    public String getMarketState() {
        return marketState;
    }

    @JsonProperty("marketState")
    public void setMarketState(String marketState) {
        this.marketState = marketState;
    }

    @JsonProperty("epsTrailingTwelveMonths")
    public Double getEpsTrailingTwelveMonths() {
        return epsTrailingTwelveMonths;
    }

    @JsonProperty("epsTrailingTwelveMonths")
    public void setEpsTrailingTwelveMonths(Double epsTrailingTwelveMonths) {
        this.epsTrailingTwelveMonths = epsTrailingTwelveMonths;
    }

    @JsonProperty("epsForward")
    public Double getEpsForward() {
        return epsForward;
    }

    @JsonProperty("epsForward")
    public void setEpsForward(Double epsForward) {
        this.epsForward = epsForward;
    }

    @JsonProperty("sharesOutstanding")
    public Integer getSharesOutstanding() {
        return sharesOutstanding;
    }

    @JsonProperty("sharesOutstanding")
    public void setSharesOutstanding(Integer sharesOutstanding) {
        this.sharesOutstanding = sharesOutstanding;
    }

    @JsonProperty("bookValue")
    public Double getBookValue() {
        return bookValue;
    }

    @JsonProperty("bookValue")
    public void setBookValue(Double bookValue) {
        this.bookValue = bookValue;
    }

    @JsonProperty("fiftyDayAverage")
    public Double getFiftyDayAverage() {
        return fiftyDayAverage;
    }

    @JsonProperty("fiftyDayAverage")
    public void setFiftyDayAverage(Double fiftyDayAverage) {
        this.fiftyDayAverage = fiftyDayAverage;
    }

    @JsonProperty("fiftyDayAverageChange")
    public Double getFiftyDayAverageChange() {
        return fiftyDayAverageChange;
    }

    @JsonProperty("fiftyDayAverageChange")
    public void setFiftyDayAverageChange(Double fiftyDayAverageChange) {
        this.fiftyDayAverageChange = fiftyDayAverageChange;
    }

    @JsonProperty("fiftyDayAverageChangePercent")
    public Double getFiftyDayAverageChangePercent() {
        return fiftyDayAverageChangePercent;
    }

    @JsonProperty("fiftyDayAverageChangePercent")
    public void setFiftyDayAverageChangePercent(Double fiftyDayAverageChangePercent) {
        this.fiftyDayAverageChangePercent = fiftyDayAverageChangePercent;
    }

    @JsonProperty("twoHundredDayAverage")
    public Double getTwoHundredDayAverage() {
        return twoHundredDayAverage;
    }

    @JsonProperty("twoHundredDayAverage")
    public void setTwoHundredDayAverage(Double twoHundredDayAverage) {
        this.twoHundredDayAverage = twoHundredDayAverage;
    }

    @JsonProperty("twoHundredDayAverageChange")
    public Double getTwoHundredDayAverageChange() {
        return twoHundredDayAverageChange;
    }

    @JsonProperty("twoHundredDayAverageChange")
    public void setTwoHundredDayAverageChange(Double twoHundredDayAverageChange) {
        this.twoHundredDayAverageChange = twoHundredDayAverageChange;
    }

    @JsonProperty("twoHundredDayAverageChangePercent")
    public Double getTwoHundredDayAverageChangePercent() {
        return twoHundredDayAverageChangePercent;
    }

    @JsonProperty("twoHundredDayAverageChangePercent")
    public void setTwoHundredDayAverageChangePercent(Double twoHundredDayAverageChangePercent) {
        this.twoHundredDayAverageChangePercent = twoHundredDayAverageChangePercent;
    }

    @JsonProperty("marketCap")
    public Integer getMarketCap() {
        return marketCap;
    }

    @JsonProperty("marketCap")
    public void setMarketCap(Integer marketCap) {
        this.marketCap = marketCap;
    }

    @JsonProperty("forwardPE")
    public Double getForwardPE() {
        return forwardPE;
    }

    @JsonProperty("forwardPE")
    public void setForwardPE(Double forwardPE) {
        this.forwardPE = forwardPE;
    }

    @JsonProperty("priceToBook")
    public Double getPriceToBook() {
        return priceToBook;
    }

    @JsonProperty("priceToBook")
    public void setPriceToBook(Double priceToBook) {
        this.priceToBook = priceToBook;
    }

    @JsonProperty("sourceInterval")
    public Integer getSourceInterval() {
        return sourceInterval;
    }

    @JsonProperty("sourceInterval")
    public void setSourceInterval(Integer sourceInterval) {
        this.sourceInterval = sourceInterval;
    }

    @JsonProperty("exchangeDataDelayedBy")
    public Integer getExchangeDataDelayedBy() {
        return exchangeDataDelayedBy;
    }

    @JsonProperty("exchangeDataDelayedBy")
    public void setExchangeDataDelayedBy(Integer exchangeDataDelayedBy) {
        this.exchangeDataDelayedBy = exchangeDataDelayedBy;
    }

    @JsonProperty("exchangeTimezoneName")
    public String getExchangeTimezoneName() {
        return exchangeTimezoneName;
    }

    @JsonProperty("exchangeTimezoneName")
    public void setExchangeTimezoneName(String exchangeTimezoneName) {
        this.exchangeTimezoneName = exchangeTimezoneName;
    }

    @JsonProperty("exchangeTimezoneShortName")
    public String getExchangeTimezoneShortName() {
        return exchangeTimezoneShortName;
    }

    @JsonProperty("exchangeTimezoneShortName")
    public void setExchangeTimezoneShortName(String exchangeTimezoneShortName) {
        this.exchangeTimezoneShortName = exchangeTimezoneShortName;
    }

    @JsonProperty("gmtOffSetMilliseconds")
    public Integer getGmtOffSetMilliseconds() {
        return gmtOffSetMilliseconds;
    }

    @JsonProperty("gmtOffSetMilliseconds")
    public void setGmtOffSetMilliseconds(Integer gmtOffSetMilliseconds) {
        this.gmtOffSetMilliseconds = gmtOffSetMilliseconds;
    }

    @JsonProperty("esgPopulated")
    public Boolean getEsgPopulated() {
        return esgPopulated;
    }

    @JsonProperty("esgPopulated")
    public void setEsgPopulated(Boolean esgPopulated) {
        this.esgPopulated = esgPopulated;
    }

    @JsonProperty("tradeable")
    public Boolean getTradeable() {
        return tradeable;
    }

    @JsonProperty("tradeable")
    public void setTradeable(Boolean tradeable) {
        this.tradeable = tradeable;
    }

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
