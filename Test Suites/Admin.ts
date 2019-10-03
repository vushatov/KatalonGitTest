<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>Admin</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient>vladyslav.ushatov@gmail.com;</mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <testSuiteGuid>1c1e8f15-2f7b-44cf-a5e6-83de4b4f4876</testSuiteGuid>
   <testCaseLink>
      <guid>0893101c-ddc6-44bf-8b04-c643a0c62659</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/StartPage</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>2f01a2f2-6a4e-4001-98cf-b75dd2d2bbe8</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/LoginAdmin</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>d34cd97c-67d7-4ee3-ab64-c9ddee5230fe</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/for AdminLogin</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>d34cd97c-67d7-4ee3-ab64-c9ddee5230fe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Username</value>
         <variableId>591f86f6-936d-4bf8-9e75-b28145e5e2d3</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>d34cd97c-67d7-4ee3-ab64-c9ddee5230fe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Password</value>
         <variableId>cd349411-855f-47b2-829f-910b2042e3a7</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>63c1fe5e-094f-4720-9cfb-f98c530eae77</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Delete user</testCaseId>
   </testCaseLink>
</TestSuiteEntity>
