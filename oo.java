/**
     * 从文件中读取xml内容
     * 
     * @param filename 全路径的报文文件路径
     * @return
     */
    public static String getXmlStringFromFile(String filename) {
        try {
            File file = new File(filename);
            FileInputStream fis = new FileInputStream(file);
            //            fis.reset();
            byte[] b = new byte[(int) file.length()];
            fis.read(b);

            String msg = new String(b, "utf-8");

            fis.close();
            if (logger.isInfoEnabled()) {
                logger.info("get file success:" + filename);
            }
            return msg;
        } catch (Exception ex) {
            logger.info(ex.getMessage());
            return null;
        }
    }
