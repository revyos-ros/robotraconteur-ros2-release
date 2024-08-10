// Copyright 2011-2020 Wason Technology, LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

%{
    #include <RobotRaconteur/BrowserWebSocketTransport.h>
%}

%shared_ptr(RobotRaconteur::BrowserWebSocketTransport)

namespace RobotRaconteur
{

class BrowserWebSocketTransport : public Transport
{
public:

	BrowserWebSocketTransport();

	BrowserWebSocketTransport(boost::shared_ptr<RobotRaconteur::RobotRaconteurNode> node);

	RR_PROPERTY(DefaultReceiveTimeout)
	int32_t GetDefaultReceiveTimeout();
	void SetDefaultReceiveTimeout(int32_t milliseconds);

	RR_PROPERTY(DefaultConnectTimeout)
	int32_t GetDefaultConnectTimeout();
	void SetDefaultConnectTimeout(int32_t milliseconds);

	RR_PROPERTY(DefaultHeartbeatPeriod)
	int32_t GetDefaultHeartbeatPeriod();
	void SetDefaultHeartbeatPeriod(int32_t milliseconds);

	virtual std::string GetUrlSchemeString() const;

	RR_PROPERTY(DisableMessage4)
	virtual bool GetDisableMessage4();
	virtual void SetDisableMessage4(bool d);

	RR_PROPERTY(DisableStringTable)
	virtual bool GetDisableStringTable();
	virtual void SetDisableStringTable(bool d);

	RR_PROPERTY(DisableAsyncMessageIO)
	virtual bool GetDisableAsyncMessageIO();
	virtual void SetDisableAsyncMessageIO(bool d);

	RR_PROPERTY(MaxMessageSize)
	int32_t GetMaxMessageSize();
	void SetMaxMessageSize(int32_t size);

    virtual std::string GetUrlSchemeString() const;
	virtual std::vector<std::string> GetServerListenUrls();

};
}
