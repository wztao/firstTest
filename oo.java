/**
     * 从文件中读取xml内容
     * 
     * @param filename 全路径的报文文件路径
     * @return
     */
    public static String getXmlStringFromFile(String filename) {
        try {
        File f = new File("c:/po.xml");
        // counting child elements of parlist
	int count = 0;
        // counting child elements of parlist named "par"
	int par_count = 0;
	FileInputStream fis =  new FileInputStream(f);
        byte[] b = new byte[(int) f.length()];
	fis.read(b);
	VTDGen vg = new VTDGen();
	vg.setDoc(b);
	vg.parse(true);
	VTDNav vn = vg.getNav();
        if (vn.matchElement("bix")){ // match blix
     	  // to first child named "package"
          if (vn.toElement(VTDNav.FC,"package")){ 
	    do {
		    System.out.println("package");
		    // to first child named "command"
	      if (vn.toElement(VTDNav.FC,"command"))
	      {
	 	 do {
		 	System.out.println("command");
 			if (vn.toElement(VTDNav.FC, "parlist")){
	   		   do {
				System.out.println("parlist");
				if (vn.toElement(VTDNav.FC)){
			        do {	
				      count++; //increment count
				      if (vn.matchElement("par"))
					 par_count++;
			   	}
				while(vn.toElement(VTDNav.NS));
				vn.toElement(VTDNav.P);
			     }
			}
			while (vn.toElement(VTDNav.NS,"parlist"));
			vn.toElement(VTDNav.P);
		    }						
	     }
	     // to next silbing named "command"
	     while (vn.toElement(VTDNav.NS, "command")); 
	     vn.toElement(VTDNav.P); // go up one level
	    }
	    else 
	      System.out.println(" no child element named 'command' ");
	    // verify result

	  }
	  while(vn.toElement(VTDNav.NS,"package")); // to next sibling named "package"
	  vn.toElement(VTDNav.P); // go up one level	
	 }else
	    System.out.println(" no child element named 'package' ");	
	} else 
	  System.out.println(" Root is not 'bix' ");
	// print out the results
	System.out.println(" count ====> " + count);
	System.out.println(" par_count ==> " + par_count);

	// verify results using iterators
        int v=0;
        vn.toElement(VTDNav.ROOT);
        AutoPilot ap = new AutoPilot(vn);
        ap.selectElement("par");
        while(ap.iterate()){
    	   if (vn.getCurrentDepth() == 4) 
	   {
		v++;
	   }
	}
	System.out.println(" verify ==> "+v);
     }
     catch (ParseException e){
	     System.out.println(" XML file parsing error \n"+e);
     }
     catch (NavException e){
	     System.out.println(" Exception during navigation "+e);
     }
     catch (java.io.IOException e)
     {
	     System.out.println(" IO exception condition"+e);
     }
    }
