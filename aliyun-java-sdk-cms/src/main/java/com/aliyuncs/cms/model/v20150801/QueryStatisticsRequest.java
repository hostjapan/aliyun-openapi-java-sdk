/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cms.model.v20150801;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class QueryStatisticsRequest extends RpcAcsRequest<QueryStatisticsResponse> {
	
	public QueryStatisticsRequest() {
		super("Cms", "2015-08-01", "QueryStatistics");
	}

	private String project;

	private String metric;

	private String period;

	private String startTime;

	private String endTime;

	private String dimensions;

	private String targetPeriod;

	private String function;

	private String extend;

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
		putQueryParameter("Project", project);
	}

	public String getMetric() {
		return this.metric;
	}

	public void setMetric(String metric) {
		this.metric = metric;
		putQueryParameter("Metric", metric);
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
		putQueryParameter("Period", period);
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		putQueryParameter("StartTime", startTime);
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		putQueryParameter("EndTime", endTime);
	}

	public String getDimensions() {
		return this.dimensions;
	}

	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
		putQueryParameter("Dimensions", dimensions);
	}

	public String getTargetPeriod() {
		return this.targetPeriod;
	}

	public void setTargetPeriod(String targetPeriod) {
		this.targetPeriod = targetPeriod;
		putQueryParameter("TargetPeriod", targetPeriod);
	}

	public String getFunction() {
		return this.function;
	}

	public void setFunction(String function) {
		this.function = function;
		putQueryParameter("Function", function);
	}

	public String getExtend() {
		return this.extend;
	}

	public void setExtend(String extend) {
		this.extend = extend;
		putQueryParameter("Extend", extend);
	}

	@Override
	public Class<QueryStatisticsResponse> getResponseClass() {
		return QueryStatisticsResponse.class;
	}

}
